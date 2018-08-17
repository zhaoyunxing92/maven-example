/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.Main
 * @date: 2018-08-17 17:28
 * @des:
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("maven:{}", "hello");
    }
}
