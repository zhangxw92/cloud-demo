package com.athome.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBanlace {

    /**
     * 获取可调用的服务
     *
     * @param list
     * @return
     */
    ServiceInstance getInstance(List<ServiceInstance> list);
}
