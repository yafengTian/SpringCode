package com.tyf.day4.Demo9;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
*Spring 自定义事件
*/

import javafx.application.Application;
import org.springframework.context.ApplicationEvent;

public class CustomeEvent extends ApplicationEvent{
    String message;
    public CustomeEvent(String message){
        super(message);
        this.message=message;
    }
    public void showMessage(){
        System.out.println("自定义事件："+message);
    }
}
