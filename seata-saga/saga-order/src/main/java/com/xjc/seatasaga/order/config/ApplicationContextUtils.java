package com.xjc.seatasaga.order.config;

import org.springframework.context.ApplicationContext;

/**
 * @Version 1.0
 * @ClassName ApplicationContextUtils
 * @Author jiachenXu
 * @Date 2020/10/24
 * @Description
 */
public class ApplicationContextUtils {

    private static ApplicationContext applicationContext;


    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextUtils.applicationContext = applicationContext;
    }
}
