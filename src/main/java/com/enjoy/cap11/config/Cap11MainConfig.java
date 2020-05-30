package com.enjoy.cap11.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("com.enjoy.cap11")
/**
 * 开启事务管理   对@Transactional注解起作用
 */
/**
 * InfrastructureAdvisorAutoProxyCreator
 * 1.注册
 * 2.利用后置处理器  包装对象并返回一个代理对象   代理对象执行方法时 利用拦截器进行调用
 *
 * AnnotationTransactionAttributeSource 事务增强器要用事务注解信息  使用这个类解析事务注解
 * TransactionInterceptor 保存了事务属性信息 事务管理器 MethodInterceptor
 * 当执行目标方法时候：
 *      执行拦截器链
 *      事务拦截器：
 *             1.先获取事务相关属性
 *             2.获取 PlatformTransactionManager 事务管理器 ， 直接到容器中获取PpatformTransactionManager bean实例
 *      执行目标方法：
 *          如果异常  ：completeTransactionAfterThrowing 利用事务管理器进行回滚操作
 *          如果正常 ：利用事务管理器提交事务
 *
 * 核心类 TransactionAspectSupport
 * 事务管理器：
 *
 *
 *
 */
@EnableTransactionManagement
public class Cap11MainConfig {

    /**
     * 创建数据源
     * @return
     * @throws PropertyVetoException
     */
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        //这个C3p0封装了JDBC接口的实现
        ComboPooledDataSource dataSource  = new ComboPooledDataSource();
        dataSource.setUser("enjoy123");
        dataSource.setPassword("enjoy123");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://cdb-4ke4xztw.bj.tencentcdb.com:10261/enjoy");
        return dataSource;
    }

    //JDBC模板  简化了增删改查的才做
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }
}
