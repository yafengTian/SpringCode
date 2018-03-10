package com.tyf.day1;
    /*
     * 初学Spring 第一天
     * @author tyf
     * time 2018-3-8
     * */
    public class HelloJava {
        private String Name;
        private String gender;
        private int age;

        public HelloJava(){}
        public HelloJava(String Name,String gender,int age){
            this.Name=Name;
            this.gender=gender;
            this.age=age;
        }
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public  static  void main(String args[]){

        }
    }

