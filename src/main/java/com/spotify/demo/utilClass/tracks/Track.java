package com.spotify.demo.utilClass.tracks;

import com.spotify.demo.utilClass.artists.Artist;
import com.spotify.demo.utilClass.artists.ExternalUrls;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Track {
    private Album album;
    private List<Artist> artists;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private boolean is_playable;
    private String name;
    private int popularity;
    private String preview_url;
    private int track_number;
    private String uri;

    @Override
    public String toString() {
        return "Track{name='" + name + "', id='" + id + "', duration_ms=" + duration_ms + ", explicit=" + explicit + "}";
    }
}
