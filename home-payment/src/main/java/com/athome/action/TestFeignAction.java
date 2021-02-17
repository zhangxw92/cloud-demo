package com.athome.action;

import com.athome.actionservice.TestFeignActionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignAction implements TestFeignActionService {

    @Override
    public String testFeign() {
        return "testFeign";
    }
}
