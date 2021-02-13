package com.athome.service.impl;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl {

    public String hello(String id){

        return "hello world,O(∩_∩)O";
    }

    public String helloTimeout(String id){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "hello world time out!";
    }
}
