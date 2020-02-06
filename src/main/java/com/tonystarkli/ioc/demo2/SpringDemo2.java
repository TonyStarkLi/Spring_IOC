package com.tonystarkli.ioc.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式
 */
public class SpringDemo2 {

    /**
     * 一般采用第一种方式
     * 只有当很复杂的时候才会使用第二种和第三种
     */
    @Test
    public void demo1() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例：
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
    }
    @Test
    public void demo2() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例：
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean1");
    }

    @Test
    public void demo3() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例：
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
    }

}
