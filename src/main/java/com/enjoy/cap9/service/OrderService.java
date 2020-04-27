package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Qualifier("testDao")
    @Autowired
    private TestDao testDao;

    public  void println(){
        System.out.println("Service...Dao......" +testDao);
    }
}
