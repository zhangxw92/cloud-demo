package com.athome.controller;

import com.athome.service.impl.PaymentServiceImpl;
import com.athome.service.impl.PaymentServiceImpl2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment22")
public class PaymentController2 {

    @Resource
    private PaymentServiceImpl2 paymentService2;

    @GetMapping("/hello2/{id}")
    public String hello(@PathVariable("id") Integer id) {
        String hello = paymentService2.hello(id);
        return hello;
    }

}
