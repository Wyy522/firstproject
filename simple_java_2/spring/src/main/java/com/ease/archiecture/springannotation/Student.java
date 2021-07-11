package com.ease.archiecture.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Clazz clazz;

    public int getAge() {
        return age;
    }

    @Value("12")
    private int age;

    public Clazz getClazz() {
        return clazz;
    }


    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void clazzPrint() {
        clazz.clazzPrint();
    }


//    public Student(Clazz clazz) {
//        this.clazz = clazz;
//    }
}
