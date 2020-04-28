package com.enjoy.cap9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * 实现BeanNameAware
 */
@Component
public class Light implements ApplicationContextAware, BeanNameAware , EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setBeanName(String name) {
        System.out.println("当前bean的名字为：" + name);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的IOC容器：" + applicationContext);
        System.out.println("从applicationContext中获取的moon为：" + applicationContext.getBean("moon"));
        this.applicationContext = applicationContext;
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result= resolver.resolveStringValue("你好${os.name},计算 #{3*8}" );
        System.out.println("解析的字符串为："  +result);
    }
}
