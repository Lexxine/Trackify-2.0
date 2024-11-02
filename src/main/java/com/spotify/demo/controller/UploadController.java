package com.spotify.demo.controller;

import com.spotify.demo.service.TrackRecordService;
import com.spotify.demo.utilClass.files.TrackRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UploadController {

    private final TrackRecordService trackRecordService;

    public UploadController(TrackRecordService trackRecordService) {
        this.trackRecordService = trackRecordService;
    }

    @GetMapping("/upload")
    public String showUploadForm() {
        return "uploadFile"; // Zwróć widok z formularzem do przesyłania plików
    }

    @GetMapping("/showStreamingHistory")
    public String handleFileUpload(@RequestParam("filePath") String filePath, Model model) throws IOException {

        List<TrackRecord> trackRecords = trackRecordService.parseJsonFromString(filePath.trim());

        Map<String, Long> totalPlayTime = trackRecordService.calculateTotalPlayTime(trackRecords);
        String dateRange = trackRecordService.getDateRange(trackRecords);

        model.addAttribute("trackRecords", trackRecords);
        model.addAttribute("totalPlayTime", totalPlayTime);
        model.addAttribute("dateRange", dateRange);
        return "results";
    }

    @GetMapping("/instruction")
    public String showInstructions() {
        return "instruction";
    }
}

