package com.spotify.demo.utilClass.tracks;

import java.util.List;


public class TrackDataClass {
    private List<Track> items;

    public TrackDataClass() {
    }

    public TrackDataClass(List<Track> items) {
        this.items = items;
    }

    public List<Track> getItems() {
        return items;
    }

    public void setItems(List<Track> items) {
        this.items = items;
    }
}
