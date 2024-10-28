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
public class Album {
    private String album_type;
    private List<Artist> artists;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private List<Images> images;
    private String name;
    private String release_date;
    private int total_tracks;
    private String type;
    private String uri;

    @Override
    public String toString() {
        return "Album{name='" + name + "', id='" + id + "', release_date='" + release_date + "', total_tracks=" + total_tracks + "}";
    }
}

