package com.spotify.demo.utilClass.artists;

import java.util.List;

public class ArtistDataClass {
    private List<Artist> items;

    public ArtistDataClass() {
    }

    public ArtistDataClass(List<Artist> items) {
        this.items = items;
    }

    public List<Artist> getItems() {
        return items;
    }

    public void setItems(List<Artist> items) {
        this.items = items;
    }
}
