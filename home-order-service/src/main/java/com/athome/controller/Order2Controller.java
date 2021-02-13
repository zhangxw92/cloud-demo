package com.athome.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 因为每个方法都要有一个服务降级的方法，会造成代码膨胀，因此改用默认配置，统一配置一个降级方法
 */
@DefaultProperties(defaultFallback = "defaultMethod")
@RestController
public class Order2Controller {

    @GetMapping("/say/{id}")
    @HystrixCommand
    public String say(@PathVariable("id") String id) {
        int i = 10 / 0;
        return "sayHello";
    }

    public String defaultMethod() {
        return "对方服务器忙请稍后重试";
    }
}
