/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo3.bean;

import com.alipay.sofa.boot.Facade.TestFacade;
import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author ruoshan
 * @version $Id: TestFactoryBean.java, v 0.1 2019年01月29日 16:15 ruoshan Exp $
 */
public class TestFactoryBean implements FactoryBean {

    private TestFacade testFacade;

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public TestFacade getTestFacade() {
        return testFacade;
    }

    public void setTestFacade(TestFacade testFacade) {
        this.testFacade = testFacade;
    }
}