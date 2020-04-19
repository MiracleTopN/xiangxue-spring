package com.enjoy.cap3;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.config.JamesTypeFilter;
import org.springframework.context.annotation.*;

@Configuration
public class Cap3MainConfig {

    /**
     * 默认是 单实例
     * prototype: 多实例 IOC容器启动的时候，IOC容器启动并不会调用方法创建对象，而是每次获取的时候才会调用方法
     * singleton:单实例(默认) IOC容器启动的时候会调用方法创建对象并放到IOC容器中，以后每次获取的就是直接从容器拿走(map.get)
     * request: 主要针对web应用 递交一次请求创建一次实例
     * session:同一session创建一个实例
     * @return
     */
    @Scope("prototype")
    @Bean
    public Person person() {
        return new Person("james", 20);
    }
}
