package com.athome.controller;

import com.alibaba.fastjson.JSON;
import com.athome.lb.RoundLoadBanlance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderRestController {

    //private String url = "http://localhost:9002";
    private String url = "http://PAYMENT";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private RoundLoadBanlance roundLoadBanlance;

    @GetMapping("/test")
    public String test() {

        String forObject = restTemplate.getForObject(url + "/pay/hello/" + 5, String.class);
        System.out.println(forObject);
        return forObject;
    }

    @GetMapping("/test2")
    public String test2() {

        List<ServiceInstance> payments = discoveryClient.getInstances("PAYMENT");
        if (payments == null || payments.size() == 0) {
            return null;
        }
        ServiceInstance instance = roundLoadBanlance.getInstance(payments);
        System.out.println("----" + JSON.toJSONString(instance));
        System.out.println("+++" + JSON.toJSONString(instance.getUri()));
        String forObject = restTemplate.getForObject(instance.getUri() + "/pay/hello/" + 5, String.class);
        System.out.println(forObject);
        return forObject;
    }
}
