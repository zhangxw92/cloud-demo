package com.athome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {


    @ResponseBody
    @GetMapping("/hello/{id}")
    String hello(@PathVariable("id") String id) {
        System.out.println("this is id=" + id);
        return "this is the hello world";
    }

}
