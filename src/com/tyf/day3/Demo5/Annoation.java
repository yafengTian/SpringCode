package com.tyf.day3.Demo5;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
* 基于注解的Spring配置
* @Required注释应用于bean属性的setter方法，它表明受影响的属性必须在xml中配置，否则会报异常
*/

import org.springframework.beans.factory.annotation.Required;

public class Annoation {
    String Name;
    String Gender;
    int age;


    public String getName() {
        return Name;
    }
@Required
    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }
@Required
    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }
@Required
    public void setAge(int age) {
        this.age = age;
    }
}
