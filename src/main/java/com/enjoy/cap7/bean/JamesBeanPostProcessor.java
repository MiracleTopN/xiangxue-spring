package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class JamesBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //返回一个传过来的对象 bean
        //在初始化方法调用之前 进行后置处理工作
        //调用时机  ： init-method 之前调用
        System.out.println("postProcessBeforeInitialization......" + beanName + "..."  + bean);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessAfterInitialization......" + beanName + "..."  + bean);
        return bean;
    }
}
