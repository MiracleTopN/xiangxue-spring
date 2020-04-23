import com.enjoy.cap9.config.Cap9MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        TestService testService = app.getBean(TestService.class);

        testService.println();

        TestDao testDao = (TestDao)app.getBean("testDao");

        System.out.println(testDao);

        app.close();

    }
}
