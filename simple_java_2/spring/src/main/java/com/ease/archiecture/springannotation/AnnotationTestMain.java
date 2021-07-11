package com.ease.archiecture.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeansTest.xml");
//        Student student = (Student) context.getBean("student");
//        student.clazzPrint();


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Student student = applicationContext.getBean("student", Student.class);
//        student.getClazz().clazzPrint();
//        System.out.println(student.getAge());
//
//        MysqlConfig config = applicationContext.getBean(MysqlConfig.class);
//        System.out.println(config.toString());
        Clazz bean = applicationContext.getBean(Clazz.class);
        System.out.println(bean.getPerson().getName());
    }
}
