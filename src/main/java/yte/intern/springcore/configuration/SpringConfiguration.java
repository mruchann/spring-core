package yte.intern.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yte.intern.springcore.BeanTest;

@Configuration
public class SpringConfiguration {

    @Bean
    public BeanTest myBeanFactory() {
        return new BeanTest();
    }
}
