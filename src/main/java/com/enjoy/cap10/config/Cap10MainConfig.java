package com.enjoy.cap10.config;


import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//把AOP开关打开
@EnableAspectJAutoProxy
public class Cap10MainConfig {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
