package com.tyf.day2.Demo1;
/*
* 初学Spring和Git
* @author tyf
* @time 2018-3-11
* Bean 定义继承
* */
public class HelloJava {
    String Name;
    String Position;//Java语言地位

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    //初始化bean
    public void init(){
        System.out.println("HelloJava will init");
    }

    //销毁bean
    public void destory(){
        System.out.println("HelloJava will destory!");
    }
}
