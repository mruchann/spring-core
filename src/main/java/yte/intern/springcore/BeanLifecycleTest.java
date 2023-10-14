package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleTest {

    public BeanLifecycleTest() {
        System.out.println("Constructor!!!");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct!!!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy!!!");
    }

    public void print() {
        System.out.println("Print!!!");
    }
}
