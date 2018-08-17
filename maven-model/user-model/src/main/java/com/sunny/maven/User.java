/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.User
 * @date: 2018-08-17 12:27
 * @des: 用户实体类
 */
public class User {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
     */
    private int sex;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.sex = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
