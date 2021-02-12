package com.athome.limiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 根据参数限流
 */
public class UserKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        System.out.println(exchange);
        System.out.println("1");
        return Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }

}
