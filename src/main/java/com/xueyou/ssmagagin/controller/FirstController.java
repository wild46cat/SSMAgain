package com.xueyou.ssmagagin.controller;

import com.xueyou.ssmagagin.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxueyou on 16/9/29.
 */
@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
public class FirstController {
    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/getjson")
    public Map<String, Object> getJson(String param) {
        Map<String, Object> params = new HashMap<>();
        params.put("param", param);
        return firstService.getJson(params);
    }
}
