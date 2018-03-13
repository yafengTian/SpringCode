package com.tyf.day4.Demo9;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
* Spring 自定义事件发布器
*/

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomePublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
    public void publish(){
        System.out.println("发布事件...");
        CustomeEvent ce=new CustomeEvent("yafeng");
        //发布事件，通知所有的listener
        applicationEventPublisher.publishEvent(ce);

    }
}
