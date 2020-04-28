package com.enjoy.cap9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sun {
    public Moon moon;

//    /**
//     * @Autowired可用用在构造函数上  对bean进行注入
//     *
//     * @param moon
//     */
//    @Autowired
//    public Sun(Moon moon) {
//        this.moon = moon;
//        System.out.println("sun  constructor......");
//    }

        /**
     * @Autowired可用用在函数参数上  对bean进行注入
     *
     * @param moon
     */
    public Sun(Moon moon) {
        this.moon = moon;
        System.out.println("sun  constructor......");
    }

    public Moon getMoon() {
        return moon;
    }

//    /**
//     * @Autowired 可以用在method上 对bean进行注入
//     * @param moon
//     */
//    @Autowired
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

//    public Sun() {
//        System.out.println("Moon constructor...");
//
//    }

    @Override
    public String toString() {
        return "Sun{" +
                "moon=" + moon +
                '}';
    }
}
