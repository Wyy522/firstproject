package com.ease.archiecture.springcore;

import org.springframework.beans.factory.annotation.Value;

public class TestEntity {
    @Value("abcd")
    private String msg;

    public String getMsg() {
        return msg;
    }

//    public void setMsg(String msg) {
//        this.msg = msg;
//    }

//    public TestEntity(String msg) {
//        this.msg = msg;
//    }

    public void init() {
        System.out.println("TestEntity被创建啦");
    }

    public void destroy() {
        System.out.println("TestEntity被销毁");
    }
}
