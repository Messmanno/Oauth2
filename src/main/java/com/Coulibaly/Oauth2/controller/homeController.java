package com.Coulibaly.Oauth2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping("/")
    public String home() {
        return "Hello homePage";
    }

    @GetMapping("/secure")
    public String secure() {
        return "Hello securePage";
    }
}
