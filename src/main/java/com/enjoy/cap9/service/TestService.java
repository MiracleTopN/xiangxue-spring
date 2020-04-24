package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class TestService {

    /**
     * 效果是一样的 与@Autowired一样可以装配bean
     * @Resource
     * 1.不支持Primary功能
     * 2.不支持Autowired false  如果取不到bean 会报错
     */
//    @Qualifier("testDao2")
//    @Qualifier("testDao")
//    @Resource(name = "testDao")
//    @Autowired(required =false) //如果 required = false  那么bean不存在不会报错
    @Inject     //需要额外引入javax.inject  和Autowired功能差不多 支持@Primary 但是没有required = false的功能 适用于非spring 的项目
    private TestDao testDao;

    public  void println(){
        System.out.println(testDao);
    }
}
