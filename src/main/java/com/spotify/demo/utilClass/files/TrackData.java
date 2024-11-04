package com.spotify.demo.utilClass.files;


import java.util.List;


public class TrackData {
    private List<TrackRecord> records;

    public TrackData() {
    }

    public TrackData(List<TrackRecord> records) {
        this.records = records;
    }

    public List<TrackRecord> getRecords() {
        return records;
    }

    public void setRecords(List<TrackRecord> records) {
        this.records = records;
    }
}
