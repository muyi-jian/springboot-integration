package com.yj.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yangjian
 * @Date: 2022/5/27 10:32
 * @FileName: IndexController
 * @Description:
 * @Version: 1.0
 */
@Controller
public class IndexController {
    /**
     * 跳转到登陆页面
     *
     * @return
     */
    @GetMapping(value = {"/login"})
    public String loginPage() {
        //跳转到登录页 login.html
        return "login";
    }
}
