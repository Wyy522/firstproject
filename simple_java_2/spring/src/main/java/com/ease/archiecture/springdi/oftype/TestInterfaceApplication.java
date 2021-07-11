package com.ease.archiecture.springdi.oftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class TestInterfaceApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansTest.xml");
        Map<String, DemoDao> beans = applicationContext.getBeansOfType(DemoDao.class);
        beans.forEach((k, v) -> System.out.println(k + "-----" + v));

    }
}
