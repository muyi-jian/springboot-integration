package com.integrate.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 15:40
 * @FileName: IndexController
 * @Description:
 * @Version: 1.0
 */
@Controller
public class IndexController {
    //自动装配 jdbcTemplate
    @Autowired
    JdbcTemplate jdbcTemplate;
    /**
     * 访问"/testSql",访问数据库
     * @return
     */
    @ResponseBody
    @GetMapping("/testSql")
    public String testSql() {
        String SQL = "SELECT count(*) from testuser`";
        Integer integer = jdbcTemplate.queryForObject(SQL, Integer.class);
        return integer.toString();
    }
}
