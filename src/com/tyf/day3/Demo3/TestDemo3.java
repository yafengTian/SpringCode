package com.tyf.day3.Demo3;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo3 {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        TextEditor editor=(TextEditor)context.getBean("editor");
        System.out.println("Message:"+editor.getMessage());
        editor.spellCheck();
    }
}
