package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SitemapController {
    @GetMapping(value = "sitemap.txt", produces = MediaType.TEXT_PLAIN_VALUE)
    String siteMap() {
        return "test";
    }
}
