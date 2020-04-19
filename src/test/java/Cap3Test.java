import com.enjoy.cap2.config.Cap2MainConfig;
import com.enjoy.cap3.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] names = app.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
        //判断是否是单例
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");
        System.out.println(bean1 == bean2);
        //结论： bean1 就是bean2, 同一个对象

    }
}
