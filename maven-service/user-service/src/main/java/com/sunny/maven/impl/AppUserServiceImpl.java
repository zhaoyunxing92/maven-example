/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven.impl;

import com.sunny.maven.AppUserService;
import com.sunny.maven.User;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.impl.AppUserServiceImpl
 * @date: 2018-08-17 12:24
 * @des:
 */
public class AppUserServiceImpl implements AppUserService {
    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public User login(String userName, String password) {
        return new User(userName, password,0);
    }
}
