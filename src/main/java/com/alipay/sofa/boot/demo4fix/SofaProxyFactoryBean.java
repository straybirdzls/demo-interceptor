/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo4fix;

import org.springframework.aop.framework.ProxyFactoryBean;

/**
 *
 * @author ruoshan
 * @version $Id: SofaProxyFactoryBean.java, v 0.1 2019年01月29日 16:39 ruoshan Exp $
 */
public class SofaProxyFactoryBean extends ProxyFactoryBean {

    public SofaProxyFactoryBean(Class<?>... interfaces) {
        setInterfaces(interfaces);
    }
}