package com.tyf.day4.Demo9;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
*/

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo9 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("Day4.xml");
        CustomePublisher publisher=(CustomePublisher)configurableApplicationContext.getBean("customEventPublisher");
        publisher.publish();
    }
}
