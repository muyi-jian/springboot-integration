package com.integrate.test.service;

import com.integrate.test.entities.TestUser;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 16:29
 * @FileName: TestService
 * @Description:
 * @Version: 1.0
 */
public interface TestUserService {
   public TestUser getUserInfo(TestUser user);
   public TestUser getUserInfoByNo(String userNo);
}
