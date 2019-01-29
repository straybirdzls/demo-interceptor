/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo1.bean;

import com.alipay.sofa.boot.demo1.Facade.TestFacade;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 *
 * @author ruoshan
 * @version $Id: NormalBeanPostProcessor.java, v 0.1 2019年01月29日 15:01 ruoshan Exp $
 */
public class NormalBeanPostProcessor implements BeanPostProcessor, TestFacade {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public void test() {

    }
}