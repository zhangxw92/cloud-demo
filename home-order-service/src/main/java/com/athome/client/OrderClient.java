package com.athome.client;

import com.athome.client.fallback.OrderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "payment", fallback = OrderClientFallBack.class)
public interface OrderClient {

    @GetMapping("/pay/hello/{id}")
    public String hello(@PathVariable("id") String id);

    @GetMapping("/pay/hello2/{id}")
    public String hello2(@PathVariable("id") String id);
}
