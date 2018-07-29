package com.tmusoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 杨俊发 on 2018-07-29.<br >
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
