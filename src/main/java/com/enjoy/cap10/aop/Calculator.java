package com.enjoy.cap10.aop;


public class Calculator {

    //业务逻辑方法 利用AOP来处理j非零的逻辑
    public int div(int i ,int j){
        System.out.println("----------------");
        return i/j;
    }
}
