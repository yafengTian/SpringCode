package com.tyf.day3.Demo6;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
* 基于注解的Spring
* AutoWire注解
*/

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
    private Student student;
    private String message;

    public Student getStudent() {
        return student;
    }
    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public String getMessage() {
        return message;
    }
    @Autowired
    public void setMessage(String message) {
        this.message = message;
    }

    public void show(){
        student.studentInforation();
        System.out.println("Message:"+this.message);
    }
}
