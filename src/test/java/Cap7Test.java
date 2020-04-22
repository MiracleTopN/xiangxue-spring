import com.enjoy.cap7.config.Cap7MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigLifeCycle.class);

        System.out.println("IOC容器创建完成......");

        app.close();
    }
}
