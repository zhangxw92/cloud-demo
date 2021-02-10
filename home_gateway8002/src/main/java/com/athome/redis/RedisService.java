package com.athome.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/test")
    public void test() {
        redisTemplate.opsForValue().set("ceshi", "ceshi");

        Object ceshi = redisTemplate.opsForValue().get("ceshi");
        System.out.println(ceshi);
    }


}
