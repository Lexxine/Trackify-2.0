package com.spotify.demo.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.demo.utilClass.files.TrackRecord;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TrackRecordService {
public List<TrackRecord> parseJsonFromString(String jsonPath) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    return objectMapper.readValue(
            new File(jsonPath),
            new TypeReference<List<TrackRecord>>() {}
    );
}
    public String getDateRange(List<TrackRecord> trackRecords) {
        if (trackRecords.isEmpty()) {
            return "N/A - N/A";
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        ZonedDateTime startDateTime = ZonedDateTime.parse(trackRecords.get(0).getTs());
        ZonedDateTime endDateTime = ZonedDateTime.parse(trackRecords.get(trackRecords.size() - 1).getTs());

        return startDateTime.format(formatter) + " - " + endDateTime.format(formatter);
    }
    public Map<String, Long> calculateTotalPlayTime(List<TrackRecord> trackRecords) {
        Map<String, Long> totalPlayTime = new HashMap<>();

        for (TrackRecord record : trackRecords) {
            String trackKey = record.getMaster_metadata_track_name() + " - " + record.getMaster_metadata_album_artist_name();
            totalPlayTime.put(trackKey, totalPlayTime.getOrDefault(trackKey, 0L) + record.getMs_played());
        }

        Map<String, Long> totalPlayTimeInMinutes = new HashMap<>();
        for (Map.Entry<String, Long> entry : totalPlayTime.entrySet()) {
            totalPlayTimeInMinutes.put(entry.getKey(), entry.getValue() / 60000);
        }

        List<Map.Entry<String, Long>> sortedEntries = new ArrayList<>(totalPlayTimeInMinutes.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return Long.compare(o2.getValue(), o1.getValue());
            }
        });

        Map<String, Long> sortedTotalPlayTime = new LinkedHashMap<>();
        for (Map.Entry<String, Long> entry : sortedEntries) {
            sortedTotalPlayTime.put(entry.getKey(), entry.getValue());
        }

        return sortedTotalPlayTime;
    }
    public List<TrackRecord> getUniqueTracks(List<TrackRecord> trackRecords) {
        return trackRecords.stream()
                .collect(Collectors.toMap(
                        record -> record.getMaster_metadata_track_name() + " - " + record.getMaster_metadata_album_artist_name(),
                        record -> record,
                        (existing, replacement) -> existing
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}

