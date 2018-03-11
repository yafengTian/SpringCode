package com.tyf.day2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 初学Spring
* @author tyf
* @time 2018-3-11
* */
public class Test_Day2 {
    public static  void main(String argsp[]){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Day2.xml");
        HelloJava hellojava=(HelloJava)context.getBean("bean_post_processor");
        System.out.println("Message："+hellojava.getMessage());
        context.registerShutdownHook();//调用该方法，确保政策关闭，并调用相关的destory
    }

}
