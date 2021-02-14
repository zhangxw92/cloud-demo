package com.athome.service.impl;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * 服务熔断测试
 */
@Service
public class PaymentServiceImpl2 {

    /**
     * 断路器测试
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "sayHello", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //开启断路器，默认是false
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),//请求量的阈值，默认是20秒
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),//5秒内如果请求超过20次打开断路器
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50") //超过50%的错误请求率就会启动短路

    })
    public String hello(Integer id) {
        if (id < 0) {
            throw new RuntimeException("参数小于0！");
        }
        return "hello world";
    }

    public String sayHello(Integer id) {

        return "断路器执行！！！";
    }
}
