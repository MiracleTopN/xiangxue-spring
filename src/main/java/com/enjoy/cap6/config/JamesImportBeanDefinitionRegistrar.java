package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata:当前类的注解信息
     * BeanDefinitionRegistry:BeanDefinition注册类 把所有要添加到容器中的bean加入
     *
     * @param importingClassMetadata
     * @param registry
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean bean1 = registry.containsBeanDefinition("com.enjoy.cap6.bean.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.enjoy.cap6.bean.Cat");
        //如果Dog和Cat同时存在于IOC容器中 那么创建Pig类 加入到容器
        if (bean1 && bean2) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", beanDefinition);
        }
    }
}
