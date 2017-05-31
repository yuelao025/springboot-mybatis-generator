package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanmin on 2017/5/31.
 */
@RestController
public class TestController {

    @RequestMapping("/index")
    public String index()
    {
        return "index action";
    }
}
