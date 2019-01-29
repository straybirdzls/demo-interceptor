/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo2.bean;

import com.alipay.sofa.boot.Facade.TestFacade;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 * @author ruoshan
 * @version $Id: TestBeanFactoryPostProcessor.java, v 0.1 2019年01月29日 15:45 ruoshan Exp $
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private TestFacade testFacade;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    public void setTestFacade(TestFacade testFacade) {
        this.testFacade = testFacade;
    }

    public TestFacade getTestFacade() {
        return testFacade;
    }
}