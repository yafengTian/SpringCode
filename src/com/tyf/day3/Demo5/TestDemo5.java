package com.tyf.day3.Demo5;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo5 {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        Annoation annoation=(Annoation) context.getBean("annoation");
        System.out.println("姓名："+annoation.getName());
        System.out.println("性别："+annoation.getGender());
        System.out.println("年龄："+annoation.getAge());
    }
}
