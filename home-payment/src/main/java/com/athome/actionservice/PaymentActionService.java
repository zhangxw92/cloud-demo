package com.athome.actionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pay")
public interface PaymentActionService {

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") String id);

    @GetMapping("/hello2/{id}")
    public String hello2(@PathVariable("id") String id);
}
