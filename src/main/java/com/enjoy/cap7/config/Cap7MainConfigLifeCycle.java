package com.enjoy.cap7.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.enjoy.cap7.bean")
public class Cap7MainConfigLifeCycle {

    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person...");
        return new Person("james",20);
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }
}
