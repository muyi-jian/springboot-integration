package com.integrate.test.controller;

import com.integrate.test.entities.TestUser;
import com.integrate.test.service.TestUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 16:32
 * @FileName: TestUserController
 * @Description:
 * @Version: 1.0
 */
@RestController
public class TestUserController {
    @Autowired
    TestUserService userService;

    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/user/getUser")
    public String getUserInfo(TestUser user, Map<String, Object> map) {
        //从数据库中查询用户信息
        TestUser loginUser = userService.getUserInfo(user);
        if (loginUser != null) {
            return loginUser.toString();
        } else {
            return "查询失败";
        }
    }
    @GetMapping("/user/getUserByNo")
    public String getUserInfoByNo(@RequestParam("userNo") String UserNo, Map<String, Object> map) {
        //从数据库中查询用户信息
        TestUser loginUser = userService.getUserInfoByNo(UserNo);
        if (loginUser != null) {
            return loginUser.toString();
        } else {
            return "查询失败";
        }
    }
    @GetMapping("/user/getUserByNo/{userNo}")
    public String getUserInfoByNo1(@PathVariable("userNo") String UserNo, Map<String, Object> map) {
        //从数据库中查询用户信息
        TestUser loginUser = userService.getUserInfoByNo(UserNo);
        if (loginUser != null) {
            logger.info("姓名："+loginUser.getUserName());
            logger.info("账户："+loginUser.getUserNo());
            return loginUser.toString();
        } else {
            return "查询失败";
        }
    }
}
