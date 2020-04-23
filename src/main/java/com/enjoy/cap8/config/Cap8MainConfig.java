package com.enjoy.cap8.config;


import com.enjoy.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 当启动容器的时候 会加载到environmentAware中
 */
@Configuration
@PropertySource(value= "classpath:/test.properties")
public class Cap8MainConfig {

    @Bean
    public Bird bird(){
        return new Bird();
    }
}
