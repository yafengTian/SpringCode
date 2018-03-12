package com.tyf.day3.Demo8;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo8 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        Profile profile=(Profile)context.getBean("profile");
        profile.show();
        System.out.println("Message:"+profile.getMessage());
    }
}
