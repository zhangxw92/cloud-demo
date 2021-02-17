package com.athome.actionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TestFeignActionService {

    @RequestMapping(value = "/testFeign", method = RequestMethod.GET)
    public String testFeign();

}
