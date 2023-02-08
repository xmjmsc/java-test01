package com.xm.spring.test;


import com.xm.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCBTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
        UserController userController = ioc.getBean("controller", UserController.class);
        userController.saveUser();

    }
}
