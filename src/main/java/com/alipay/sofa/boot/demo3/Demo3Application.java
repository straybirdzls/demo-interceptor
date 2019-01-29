/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.boot.demo3;

import com.alipay.sofa.boot.Facade.TestFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author ruoshan
 * @version $Id: Demo3Application.java, v 0.1 2019年01月29日 16:14 ruoshan Exp $
 */
@SpringBootApplication
@ImportResource("classpath:spring/demo3/*.xml")
public class Demo3Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Demo3Application.class,args);
        ((TestFacade)applicationContext.getBean("testBean")).test();
    }
}