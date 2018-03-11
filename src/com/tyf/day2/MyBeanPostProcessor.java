package com.tyf.day2;
/*
*初学Spring和Git
* @author tyf
* @time 2018-3-11
* Bean后置处理器
* ApplicationContext会自动检测实现BeanPostProsscer接口的bean，注册这些bean为后置处理器
* */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
//任何bean初始化之前调用，可以实现更加复杂的处理逻辑
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization :"+beanName);
        return bean;
    }
    //任何bean初始化之后调用，可以实现更加复杂的处理逻辑
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization :"+beanName);
        return bean;
    }
}
