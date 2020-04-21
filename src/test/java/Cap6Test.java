import com.enjoy.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);

        System.out.println("IOC容器创建完成......");

        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
