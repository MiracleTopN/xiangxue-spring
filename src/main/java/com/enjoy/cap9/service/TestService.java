package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    /**
     * 效果是一样的 与@Autowired一样可以装配bean
     */
//    @Qualifier("testDao2")
//    @Qualifier("testDao")
//    @Resource(name = "testDao")
    @Autowired
    private TestDao testDao;

    public  void println(){
        System.out.println(testDao);
    }
}
