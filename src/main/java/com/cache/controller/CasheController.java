package com.cache.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cache")
public class CasheController {

    @GetMapping("/hello")
    @Cacheable("hello")
    public String hello() {
        System.out.println("No cache");
        return "Hello World";
    }
    
    @GetMapping("/clean")
    @CacheEvict("hello")
    public String cleanCache() {
        System.out.println("Clean cache");
        return "Clean cache";
    }
}
