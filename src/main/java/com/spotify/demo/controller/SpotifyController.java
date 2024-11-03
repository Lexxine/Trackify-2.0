package com.spotify.demo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.demo.utilClass.artists.Artist;
import com.spotify.demo.service.SpotifyService;
import com.spotify.demo.utilClass.tracks.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SpotifyController {

    private final SpotifyService spotifyService;

    @Autowired
    public SpotifyController(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @GetMapping("/top-artists")
    public String getTopArtists(Model model, @AuthenticationPrincipal OAuth2User user,
                                @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        List<Artist> artists = spotifyService.getTopArtists(accessToken);

        model.addAttribute("artists", artists);

        return "topArtists";
    }

    @GetMapping("/top-tracks")
    public String getTopTracks(Model model, @AuthenticationPrincipal OAuth2User user,
                               @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        List<Track> tracks = spotifyService.getTopTracks(accessToken);

        model.addAttribute("tracks", tracks);

        return "topTracks";
    }

    @GetMapping("/top-genres")
    public String getTopGenres(Model model,
                               @AuthenticationPrincipal OAuth2User user,
                               @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        Map<String, Integer> topGenres = spotifyService.getTopGenres(accessToken);

        model.addAttribute("topGenres", topGenres);

        return "topGenres";
    }

    @GetMapping("/artist/{id}")
    public String getArtistDetails(@PathVariable String id, Model model,
                                   @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String artistId = id.trim();
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        Artist artist = spotifyService.getArtistById(artistId, accessToken);

        model.addAttribute("artist", artist);

        return "artistCard";
    }

    @GetMapping("/track/{id}")
    public String getTrackDetails(@PathVariable String id, Model model,
                                  @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient authorizedClient) {
        String trackId = id.trim();
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        Track track = spotifyService.getTrackById(trackId, accessToken);  // Zakładam, że istnieje metoda w serwisie do pobierania artysty po ID

        model.addAttribute("track", track);

        return "trackCard";
    }
}
