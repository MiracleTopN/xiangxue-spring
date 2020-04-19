import com.enjoy.cap3.Cap3MainConfig;
import com.enjoy.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);

        System.out.println("IOC容器创建完成......");
        app.getBean("person");
    }
}
