package com.spotify.demo.utilClass.tracks;

import com.spotify.demo.utilClass.artists.Artist;
import com.spotify.demo.utilClass.artists.ExternalUrls;

import java.util.List;


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

    public Album() {
    }

    public Album(String album_type, List<Artist> artists, ExternalUrls external_urls, String href, String id, List<Images> images, String name, String release_date, int total_tracks, String type, String uri) {
        this.album_type = album_type;
        this.artists = artists;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.release_date = release_date;
        this.total_tracks = total_tracks;
        this.type = type;
        this.uri = uri;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public ExternalUrls getExternal_urls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public List<Images> getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getTotal_tracks() {
        return total_tracks;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public void setExternal_urls(ExternalUrls external_urls) {
        this.external_urls = external_urls;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setTotal_tracks(int total_tracks) {
        this.total_tracks = total_tracks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

