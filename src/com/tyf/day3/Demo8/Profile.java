package com.tyf.day3.Demo8;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
* 基于AutoWire和Qualifier注解的Spring
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    @Autowired
    @Qualifier("student4")
    private Student student;
    private String message;
    public Profile(){
        System.out.println("In Profile Constructor！");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void show(){
        student.studentInforation();
    }
}
