package com.integrate.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 10:30
 * @FileName: HelloController
 * @Description:
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }
}
