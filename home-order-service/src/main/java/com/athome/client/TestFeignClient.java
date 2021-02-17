package com.athome.client;

import com.athome.client.fallback.OrderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "payment")
public interface TestFeignClient {

    @GetMapping("/testFeign")
    public String testFeign();

}
