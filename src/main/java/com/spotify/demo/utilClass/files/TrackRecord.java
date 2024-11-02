package com.spotify.demo.utilClass.files;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TrackRecord {
    private String ts;
    private String username;
    private String platform;
    private long ms_played;
    private String conn_country;
    private String ip_addr_decrypted;
    private String user_agent_decrypted;
    private String master_metadata_track_name;
    private String master_metadata_album_artist_name;
    private String master_metadata_album_album_name;
    private String spotify_track_uri;
    private String episode_name;
    private String episode_show_name;
    private String spotify_episode_uri;
    private String reason_start;
    private String reason_end;
    private boolean shuffle;
    private boolean skipped;
    private boolean offline;
    private long offline_timestamp;
    private boolean incognito_mode;
}

