package com.odnt.sociallogin.controller;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, Home!";
    }

//    @GetMapping("/secured")
//    public String secured() {
//        return "Hello, Secured!";
//
//    }
    @GetMapping("/secured")
    public Object currentUser(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
