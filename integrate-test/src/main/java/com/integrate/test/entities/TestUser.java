package com.integrate.test.entities;

/**
 * @Author: yangjian
 * @Date: 2022/6/6 15:55
 * @FileName: TestUser
 * @Description:
 * @Version: 1.0
 */
public class TestUser {
    private Integer id;
    private String userName;
    private String userNo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userNo='" + userNo + '\'' +
                '}';
    }
}
