package com.spotify.demo.utilClass.artists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ExternalUrls {
    private String spotify;

    public ExternalUrls(){}

    public ExternalUrls(String spotify) {
        this.spotify = spotify;
    }

    public String getSpotify() {
        return spotify;
    }
}
