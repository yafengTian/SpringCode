package com.tyf.day2;
/*
初学spring和Git
* @author tyf
* @time 2018-3-11
* */
public class HelloJava {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //初始化bean的方法
    public  void init(){
        System.out.println("the bean is going through init");
    }
    //销毁bean的方法
    public void destory(){
        System.out.println("the bean will be destoried");
    }
}
