package com.tyf.day2.Demo1;

public class HelloPython {
    String Name;
    String Position;//Python地位
    int age;//已经出现多少年

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
        this.Position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //初始化bean
    public void init(){
        System.out.println("Python will init");
    }

    //销毁bean
    public void destory(){
        System.out.println("Python will destory!");
    }
}
