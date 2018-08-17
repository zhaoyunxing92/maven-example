/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.AppUserService
 * @date: 2018-08-17 12:22
 * @des:
 */
public interface AppUserService {
    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     */
    User login(String userName, String password);
}
