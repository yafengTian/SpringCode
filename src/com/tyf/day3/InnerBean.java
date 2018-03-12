package com.tyf.day3;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
* 注入内部Beans
*/

public class InnerBean {
    private Load load;

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    //调用内部类
    public void innerBean() {
        load.loading();
    }
}
