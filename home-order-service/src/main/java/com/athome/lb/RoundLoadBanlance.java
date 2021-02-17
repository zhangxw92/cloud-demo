/*
package com.athome.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class RoundLoadBanlance implements LoadBanlace {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance getInstance(List<ServiceInstance> list) {
        int i = getCount() % list.size();
        return list.get(i);
    }

    */
/**
     * 统计执行的次数
     *
     * @return
     *//*

    public final int getCount() {
        int current;
        int next;

        do {
            current = atomicInteger.get();
            next = current > Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));

        return next;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
*/
