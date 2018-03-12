package com.tyf.day3.Demo7;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo7 {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        Annotation annotation=(Annotation)context.getBean("annotation_attribute");
        annotation.show();

    }

}
