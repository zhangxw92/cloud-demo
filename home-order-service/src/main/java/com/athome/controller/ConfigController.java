package com.athome.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${info.abc}")
    private String abc;


    @GetMapping("/info")
    public String info() {
        return abc;
    }
}
