package com.spotify.demo.service;

import com.spotify.demo.utilClass.artists.Artist;
import com.spotify.demo.utilClass.artists.ArtistDataClass;
import com.spotify.demo.utilClass.tracks.Track;
import com.spotify.demo.utilClass.tracks.TrackDataClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SpotifyService {

    private final RestTemplate restTemplate;

    @Autowired
    public SpotifyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Artist> getTopArtists(String accessToken) {
        String url = "https://api.spotify.com/v1/me/top/artists";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<ArtistDataClass> response = restTemplate.exchange(url, HttpMethod.GET, entity, ArtistDataClass.class);
        System.out.println(Arrays.toString(response.getBody().getItems().toArray()));
        return response.getBody().getItems();

    }

    public List<Track> getTopTracks(String accessTocken) {

        String url = "https://api.spotify.com/v1/me/top/tracks";

        HttpHeaders headers2 = new HttpHeaders();
        headers2.setBearerAuth(accessTocken);

        HttpEntity<String> entity2 = new HttpEntity<>(headers2);

        ResponseEntity<TrackDataClass> response2 = restTemplate.exchange(url, HttpMethod.GET, entity2, TrackDataClass.class);
        System.out.println(Arrays.toString(response2.getBody().getItems().toArray()));
        return response2.getBody().getItems();

    }

    public LinkedHashMap<String, Integer> getTopGenres(String accessToken) {
        String url = "https://api.spotify.com/v1/me/top/artists";
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<ArtistDataClass> response = restTemplate.exchange(url, HttpMethod.GET, entity, ArtistDataClass.class);

        Map<String, Integer> genreCount = new HashMap<>();

        for (Artist artist : response.getBody().getItems()) {
            for (String genre : artist.getGenres()) {
                genreCount.put(genre, genreCount.getOrDefault(genre, 0) + 1);
            }
        }

        return genreCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public Artist getArtistById(String artistId, String accessToken) {
        String url = "https://api.spotify.com/v1/artists/" + artistId;

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Artist> response = restTemplate.exchange(url, HttpMethod.GET, entity, Artist.class);

        return response.getBody();
    }

    public Track getTrackById(String trackId, String accessToken) {
        String url = "https://api.spotify.com/v1/tracks/" + trackId;

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Track> response = restTemplate.exchange(url, HttpMethod.GET, entity, Track.class);

        return response.getBody();
    }

}
