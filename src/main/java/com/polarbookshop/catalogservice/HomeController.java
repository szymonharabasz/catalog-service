package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.config.PolarProperties;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    private final PolarProperties polarProperties;

    public HomeController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        System.out.println("Greeting: " + polarProperties.getGreeting());
        return polarProperties.getGreeting();
    }
    
}
