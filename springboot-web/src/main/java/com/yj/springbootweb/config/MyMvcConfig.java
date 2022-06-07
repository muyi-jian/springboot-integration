package com.yj.springbootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: yangjian
 * @Date: 2022/5/27 10:26
 * @FileName: MyMvcConfig
 * @Description: mvc配置类,实现WebMvcConfigurer接口可以来扩展 SpringMVC 的功能，@EnableWebMvc 完全接管SpringMVC
 * @Version: 1.0
 */

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问 “/” 或 “/index.html” 时，都直接跳转到登陆页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }
}
