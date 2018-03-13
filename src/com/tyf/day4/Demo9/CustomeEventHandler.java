package com.tyf.day4.Demo9;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
* 自定义事件监听器
* 监听到事件后作出相应的处理
*/

import org.springframework.context.ApplicationListener;

public class CustomeEventHandler implements ApplicationListener<CustomeEvent> {
    @Override
    public void onApplicationEvent(CustomeEvent customeEvent){
        System.out.println("监听事件...");
        customeEvent.showMessage();//处理事件
    }
}
