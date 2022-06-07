package com.yj.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yangjian
 * @Date: 2022/5/26 15:53
 * @FileName: HelloController
 * @Description: 测试thymeleaf
 * @Version: 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        //通过 map 向前台页面传递数据
        map.put("name", "编程");
        return "hello";
    }
}
