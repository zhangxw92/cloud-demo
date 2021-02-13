package com.athome.client.fallback;

import com.athome.client.OrderClient;
import org.springframework.stereotype.Component;

@Component
public class OrderClientFallBack implements OrderClient {
    @Override
    public String hello(String id) {
        return "进行服务降级处理，hello方法";
    }

    @Override
    public String hello2(String id) {
        return "进行服务降级处理，hello2方法";
    }
}
