package com.tonystarkli.ioc.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {


    @Test
    /**
     * 传统方式开发
     */
    public void demo1() {
        //UserService userService = new UserServiceImpl();

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 设置属性；
        userServiceImpl.setName("tony");
        userServiceImpl.sayHello();
    }

    @Test
    /**
     * Spring的方式实现
     */
    public void demo2() {

        // 创建Spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();

        Food food = (Food) applicationContext.getBean("food");
        System.out.println(food.toString());
    }

    @Test
    /**
     * 读取磁盘系统中的配置文件
     */
    public void demo3() {
        // 创建Spring的工厂
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext();
    }
}
