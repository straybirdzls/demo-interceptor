/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo1;

import com.alipay.sofa.boot.Facade.TestFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author ruoshan
 * @version $Id: Demo1Application.java, v 0.1 2019年01月29日 14:57 ruoshan Exp $
 */
@SpringBootApplication
@ImportResource("classpath:spring/demo1/*.xml")
public class Demo1Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Demo1Application.class,args);
        ((TestFacade)applicationContext.getBean("priorityOrderedBeanPostProcessor")).test();
        ((TestFacade)applicationContext.getBean("orderedBeanPostProcessor")).test();
        ((TestFacade)applicationContext.getBean("normalBeanPostProcessor")).test();
    }
}