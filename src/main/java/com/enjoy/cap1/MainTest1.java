package com.enjoy.cap1;

import config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {

    public static void main(String[] args) {
//        //把beans.xml的类加在到容器中
//        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        //从IOC容器中获取bean
//        Person person = (Person) app.getBean("person");
//        System.out.println(person);

        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) app.getBean("person");
        System.out.println(person);

        String[] namesForBean = app.getBeanNamesForType(Person.class);

        for(String name : namesForBean){
            System.out.println(name);
        }
    }
}

