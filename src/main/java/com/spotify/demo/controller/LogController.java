package com.spotify.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {


    @GetMapping("/index")
    public String loginSuccess(@AuthenticationPrincipal OAuth2User user, Model model) {
        String userName = user.getName();
        model.addAttribute("userName", userName);
        return "index";
    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error";
    }
}
