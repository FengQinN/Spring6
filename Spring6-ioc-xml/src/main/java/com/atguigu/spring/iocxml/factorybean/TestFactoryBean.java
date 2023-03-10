package com.atguigu.spring.iocxml.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
