package me.hasantha.springoauth2scoiallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "This is a restricted page!";
    }
}
