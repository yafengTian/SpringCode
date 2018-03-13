package com.tyf.day4.Demo10;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/13 0013
*/

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ApplicationEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //刷新或者初始化applicationContext事件
        if(applicationEvent instanceof ContextRefreshedEvent){
            System.out.println(applicationEvent.getClass().getSimpleName()+"  事件发生了！");
        }//启动ApplicationContext事件
        else if(applicationEvent instanceof ContextStartedEvent){
            System.out.println(applicationEvent.getClass().getSimpleName()+"  事件发生了！");
        }//停止Applicationcontext事件
        else if(applicationEvent instanceof ContextStoppedEvent){
            System.out.println(applicationEvent.getClass().getSimpleName()+"  事件发生了！");
        }//关闭ApplicationContext事件
        else if(applicationEvent instanceof ContextClosedEvent){
            System.out.println(applicationEvent.getClass().getSimpleName()+"  事件发生了！");
        }
    }
}
