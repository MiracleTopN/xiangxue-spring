package com.enjoy.cap9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Moon {

    public Moon(){
        System.out.println("Moon constructor...");
    }

    public void init(){
        System.out.println("Moon init...");
    }

    public void destroy(){
        System.out.println("Moon destroy...");
    }
}
