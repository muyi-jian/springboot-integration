package com.integrate.test.mapper;

import com.integrate.test.entities.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 16:20
 * @FileName: TestUserMapper
 * @Description:
 * @Version: 1.0
 */
@Mapper
public interface TestUserMapper {
    TestUser getUserInfo(TestUser user);
    @Select("SELECT * FROM TESTUSER WHERE USERNO=#{userNO,jdbcType=VARCHAR}")
    TestUser getUserInfoByNo(String userNo);

}
