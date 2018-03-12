package com.tyf.day3.Demo4;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo4 {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        AutoWireByConstructor constructor=(AutoWireByConstructor)context.getBean("by_constructor");
        constructor.spellCheck();

    }
}
