package com.athome.action;

import com.athome.actionservice.PaymentActionService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentAction implements PaymentActionService {

    @Override
    public String hello(@PathVariable("id") String id) {
//        try {
//            //Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "Hello World :" + id;
    }

    @Override
    @HystrixCommand(fallbackMethod = "hello3", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String hello2(@PathVariable("id") String id) {
        //int i = 10 / 0;
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "hello world time out!";
    }

    public String hello3(String id) {

        return "服务忙或者错误！";
    }
}
