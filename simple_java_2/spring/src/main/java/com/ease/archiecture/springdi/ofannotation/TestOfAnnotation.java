package com.ease.archiecture.springdi.ofannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class TestOfAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeansTest.xml");
        Map<String, Object> objectMap = context.getBeansWithAnnotation(Color.class);
        objectMap.forEach((k, v) -> System.out.println(k + "----->" + v));
    }
}
