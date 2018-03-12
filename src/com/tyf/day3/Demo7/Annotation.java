package com.tyf.day3.Demo7;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
    @Autowired
    private Student student;
    private String message;

    public Student getStudent() {
        return student;
    }

   /* public void setStudent(Student student) {
        this.student = student;
    }*/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  void show(){
        student.studentInforation();
        System.out.println("Message:"+message);
    }
}
