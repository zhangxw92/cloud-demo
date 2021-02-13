package com.athome.controller;

import com.athome.service.impl.PaymentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        String hello = paymentService.hello(id);
        System.out.println("this is  id: " + id);
        return hello;
    }

    @GetMapping("/hello2/{id}")
    public String hello2(@PathVariable("id") String id) {
        String hello = paymentService.helloTimeout(id);
        System.out.println("this is  id: " + id);
        return hello;
    }
}
