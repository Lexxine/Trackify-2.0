package com.spotify.demo.utilClass.files;

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

    public TrackRecord() {
    }

    // Getters and Setters
    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public long getMs_played() {
        return ms_played;
    }

    public void setMs_played(long ms_played) {
        this.ms_played = ms_played;
    }

    public String getConn_country() {
        return conn_country;
    }

    public void setConn_country(String conn_country) {
        this.conn_country = conn_country;
    }

    public String getIp_addr_decrypted() {
        return ip_addr_decrypted;
    }

    public void setIp_addr_decrypted(String ip_addr_decrypted) {
        this.ip_addr_decrypted = ip_addr_decrypted;
    }

    public String getUser_agent_decrypted() {
        return user_agent_decrypted;
    }

    public void setUser_agent_decrypted(String user_agent_decrypted) {
        this.user_agent_decrypted = user_agent_decrypted;
    }

    public String getMaster_metadata_track_name() {
        return master_metadata_track_name;
    }

    public void setMaster_metadata_track_name(String master_metadata_track_name) {
        this.master_metadata_track_name = master_metadata_track_name;
    }

    public String getMaster_metadata_album_artist_name() {
        return master_metadata_album_artist_name;
    }

    public void setMaster_metadata_album_artist_name(String master_metadata_album_artist_name) {
        this.master_metadata_album_artist_name = master_metadata_album_artist_name;
    }

    public String getMaster_metadata_album_album_name() {
        return master_metadata_album_album_name;
    }

    public void setMaster_metadata_album_album_name(String master_metadata_album_album_name) {
        this.master_metadata_album_album_name = master_metadata_album_album_name;
    }

    public String getSpotify_track_uri() {
        return spotify_track_uri;
    }

    public void setSpotify_track_uri(String spotify_track_uri) {
        this.spotify_track_uri = spotify_track_uri;
    }

    public String getEpisode_name() {
        return episode_name;
    }

    public void setEpisode_name(String episode_name) {
        this.episode_name = episode_name;
    }

    public String getEpisode_show_name() {
        return episode_show_name;
    }

    public void setEpisode_show_name(String episode_show_name) {
        this.episode_show_name = episode_show_name;
    }

    public String getSpotify_episode_uri() {
        return spotify_episode_uri;
    }

    public void setSpotify_episode_uri(String spotify_episode_uri) {
        this.spotify_episode_uri = spotify_episode_uri;
    }

    public String getReason_start() {
        return reason_start;
    }

    public void setReason_start(String reason_start) {
        this.reason_start = reason_start;
    }

    public String getReason_end() {
        return reason_end;
    }

    public void setReason_end(String reason_end) {
        this.reason_end = reason_end;
    }

    public boolean isShuffle() {
        return shuffle;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    public boolean isSkipped() {
        return skipped;
    }

    public void setSkipped(boolean skipped) {
        this.skipped = skipped;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public long getOffline_timestamp() {
        return offline_timestamp;
    }

    public void setOffline_timestamp(long offline_timestamp) {
        this.offline_timestamp = offline_timestamp;
    }

    public boolean isIncognito_mode() {
        return incognito_mode;
    }

    public void setIncognito_mode(boolean incognito_mode) {
        this.incognito_mode = incognito_mode;
    }
}
