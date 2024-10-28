package com.spotify.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CustomLoginController {
    @GetMapping("/custom-login")
    public String customLogin() {
        return "custom-login";
    }
}

