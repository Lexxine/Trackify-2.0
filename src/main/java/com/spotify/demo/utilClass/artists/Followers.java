package com.spotify.demo.utilClass.artists;

public class Followers {
    private String href;
    private int total;

    public Followers() {
    }

    public Followers(String href, int total) {
        this.href = href;
        this.total = total;
    }

    public String getHref() {
        return href;
    }

    public int getTotal() {
        return total;
    }
}
