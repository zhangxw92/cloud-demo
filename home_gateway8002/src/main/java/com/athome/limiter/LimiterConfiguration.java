package com.athome.limiter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 具体的限流策略配置,限流策略只能使用一个
 */
@Configuration
public class LimiterConfiguration {

    @Bean
    public IPKeyResolver ipKeyResolver() {
        return new IPKeyResolver();
    }

//    @Bean
//    public UriKeyResolver uriKeyResolver() {
//        return new UriKeyResolver();
//    }

//    @Bean
//    public UserKeyResolver userKeyResolver() {
//        return new UserKeyResolver();
//    }
}
