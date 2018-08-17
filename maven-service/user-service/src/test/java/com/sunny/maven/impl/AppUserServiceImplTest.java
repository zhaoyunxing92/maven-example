package com.sunny.maven.impl;

import com.sunny.maven.AppUserService;
import com.sunny.maven.User;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.impl.AppUserServiceImplTest
 * @date: 2018-08-17 13:38
 * @des:
 */
public class AppUserServiceImplTest {
    private final static Logger logger = LoggerFactory.getLogger(AppUserServiceImplTest.class);
    private AppUserService appUserService;

    @Before
    public void init() {
        if (null == appUserService)
            appUserService = new AppUserServiceImpl();
    }

    @Test
    public void login() {
        User sunny = appUserService.login("sunny", "123456");
        logger.info("login：{}", sunny.toString());
    }
}