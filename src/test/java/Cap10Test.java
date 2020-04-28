import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.config.Cap10MainConfig;
import com.enjoy.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
        //所有的bean必须通过Spring管理 AOP才能生效
//        Calculator c = new Calculator();
//
//       int result =  c.div(4,3);
//
//       System.out.println(result);

        Calculator c =app.getBean(Calculator.class);

       int result =  c.div(4,3);

       System.out.println(result);

        app.close();


    }
}
