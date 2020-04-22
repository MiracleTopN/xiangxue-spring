import com.enjoy.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);

        System.out.println("IOC容器创建完成......");

        Object bean1 = app.getBean("jamesFactoryBean");

        //此种类型为Monkey
        System.out.println("bean的类型=" + bean1.getClass());

        Object bean2 = app.getBean("&jamesFactoryBean");

        //此种类型为beanFactory
        System.out.println("bean类型= " + bean2.getClass());

        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
