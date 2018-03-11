package com.tyf.day2.Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
    public static  void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day2.xml");
        HelloJava hellojava=(HelloJava)context.getBean("hellojava");
        System.out.println("语言："+hellojava.getName());
        System.out.println("地位;"+hellojava.getPosition());

        HelloPython python=(HelloPython) context.getBean("hellopython");
        System.out.println("语言："+python.getName());
        System.out.println("地位:"+python.getPosition());
        System.out.println("时长："+python.getAge());

    }
}
