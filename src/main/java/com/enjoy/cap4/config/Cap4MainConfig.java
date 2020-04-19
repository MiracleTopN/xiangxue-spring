package com.enjoy.cap4.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Cap4MainConfig {

    /**
     * 默认是 单实例
     * 懒加载:针对的是 单实例bean 默认在容器中启动的时候创建对象
     * 懒加载:容器启动的时候不加载 仅当第一次获取bean的时候才会初始化
     *
     * @return
     */
    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器中创建person");
        return new Person("james", 20);
    }
}
