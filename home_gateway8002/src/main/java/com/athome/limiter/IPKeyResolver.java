package com.athome.limiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 根据uri限流
 */
public class IPKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        System.out.println(exchange.getRequest().getRemoteAddress().getHostName());
        return Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
