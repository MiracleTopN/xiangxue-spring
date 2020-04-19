package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {

    @Bean()
    public Person person() {
        return new Person("james", 20);
    }
}
