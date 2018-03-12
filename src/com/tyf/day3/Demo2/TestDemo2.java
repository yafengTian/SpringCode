package com.tyf.day3.Demo2;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
    public static  void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Day3.xml");
        Collection collection=(Collection)context.getBean("collection");
        System.out.println("List:"+collection.getMyList());
        System.out.println("Set:"+collection.getMySet());
        System.out.println("Map:"+collection.getMyMap());
    }
}
