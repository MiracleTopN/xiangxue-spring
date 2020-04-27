package com.enjoy.cap9.config;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.enjoy.cap9.controller","com.enjoy.cap9.service","com.enjoy.cap9.dao"})
public class Cap9MainConfig {

//    @Primary  //spring默认装配时默认首选的bean  在容器中存在多个实例的时候 优先使用这个bean
    @Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }

//    @Bean("testDao3")
//    @Scope(value = "prototype")
//    public TestDao testDao1(){
//        TestDao testDao = new TestDao();
//        testDao.setFlag("3");
//        return testDao;
//    }
}
