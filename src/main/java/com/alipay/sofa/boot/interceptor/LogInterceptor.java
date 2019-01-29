/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.interceptor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 *
 * @author ruoshan
 * @version $Id: LogInterceptor.java, v 0.1 2019年01月29日 15:05 ruoshan Exp $
 */
public class LogInterceptor implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if ("test".equals(method.getName())) {
            System.out.println("-------------- target: " + target.getClass().getName() + "is intercepted! --------------");
        }
    }
}