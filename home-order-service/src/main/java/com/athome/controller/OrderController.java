package com.athome.controller;

import com.athome.client.OrderClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class OrderController {
    @Autowired
    private OrderClient orderClient;

    @GetMapping("/hello/{id}")
    String hello(@PathVariable("id") String id) {
        String hello = orderClient.hello(id);
        System.out.println("this is  id: " + id);
        return hello;
    }

    @GetMapping("/hello2/{id}")
    @HystrixCommand(fallbackMethod = "hello3", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    String hello2(@PathVariable("id") String id) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String hello = orderClient.hello2(id);
        System.out.println("this is  id: " + id);
        return hello;
    }


    String hello3(@PathVariable("id") String id) {
        System.out.println("this is  id: " + id);
        return "服务器出错，请稍后重试";
    }

/*    @ResponseBody
    @GetMapping("/hello/{id}")
    String hello(@PathVariable("id") String id) {
        System.out.println("this is id=" + id);
        return "this is the hello world";
    }*/

}
