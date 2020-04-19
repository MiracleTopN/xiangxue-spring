package config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解生成bean
 * 配置类 ===配置文件
 */
@Configuration
public class MainConfig {

    /**
     * @return
     */
    @Bean("abcPerson")
    public Person person() {
        return new Person("james", 20);
    }
}
