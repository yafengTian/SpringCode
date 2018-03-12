package com.tyf.day3.Demo7;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
*/

public class Student {
    String Name;
    String Gender;
    int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void studentInforation(){
        System.out.println("姓名："+this.Name);
        System.out.println("性别："+this.Gender);
        System.out.println("年龄："+this.Age);
    }
}
