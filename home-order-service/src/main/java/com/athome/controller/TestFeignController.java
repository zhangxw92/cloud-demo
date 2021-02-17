package com.athome.controller;

import com.athome.client.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {

    @Autowired
    private TestFeignClient testFeignClient;

    @GetMapping("/test")
    public String test() {
        String test = testFeignClient.testFeign();
        return test;
    }
}
