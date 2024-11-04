package com.spotify.demo.utilClass.artists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Artist {
    private ExternalUrls external_urls;
    private Followers followers;
    private List<String> genres;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private int popularity;
    private String type;
    private String uri;

    @Override
    public String toString() {
        return "Artist{name='" + name + "', id='" + id + "', genres=" + genres + ", popularity=" + popularity + "}";
    }
}
