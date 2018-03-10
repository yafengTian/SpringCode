package com.tyf.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 测试类
* @author tyf
* @time 2018-3-10
* */
public class Test_Day1 {
    public static  void main(String args[]){
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
        HelloJava hello=(HelloJava)context.getBean("hellojava");
        System.out.println("姓名："+hello.getName());
        System.out.println("性别："+hello.getGender());
    }
}
