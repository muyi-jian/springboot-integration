package com.integrate.test.service.impl;

import com.integrate.test.entities.TestUser;
import com.integrate.test.mapper.TestUserMapper;
import com.integrate.test.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 16:30
 * @FileName: TestUserServiceIpml
 * @Description:
 * @Version: 1.0
 */
@Service
public class TestUserServiceIpml implements TestUserService {
    @Autowired
    public TestUserMapper userMapper;
    @Override
    public TestUser getUserInfo(TestUser user) {
        TestUser userInfo = userMapper.getUserInfo(user);
        return userInfo;
    }

    @Override
    public TestUser getUserInfoByNo(String userNo) {
        return userMapper.getUserInfoByNo(userNo);
    }
}
