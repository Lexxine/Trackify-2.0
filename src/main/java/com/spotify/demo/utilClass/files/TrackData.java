package com.spotify.demo.utilClass.files;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TrackData {
    private List<TrackRecord> records;
}
