package com.tyf.day4.Demo10;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
*/

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo10 {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Day4.xml");
        context.refresh();//刷新Applicationcontext
        context.start();//启动ApplicationContext
        context.stop();//停止ApplicationContext
        context.close();//关闭ApplicationContext
    }
}
