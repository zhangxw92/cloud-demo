package com.athome.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaymentDiscoveryController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Object discovery() {

        for (String s : discoveryClient.getServices()) {
            System.out.println(s);
        }

        List<ServiceInstance> payment = discoveryClient.getInstances("PAYMENT");

        for (ServiceInstance serviceInstance : payment) {
            System.out.println(serviceInstance.getHost() + "-" + serviceInstance.getPort() + "-" + serviceInstance.getUri());
        }

        return discoveryClient;
    }
}
