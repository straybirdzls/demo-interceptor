/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo2;

import com.alipay.sofa.boot.Facade.TestFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author ruoshan
 * @version $Id: Demo2Application.java, v 0.1 2019年01月29日 15:41 ruoshan Exp $
 */
@SpringBootApplication
@ImportResource("classpath:spring/demo2/*.xml")
public class Demo2Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Demo2Application.class,args);
        ((TestFacade)applicationContext.getBean("testBean")).test();
    }
}