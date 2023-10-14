package yte.intern.springcore.injection;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    public void print() {
        System.out.println("Constructor Injection!!!");
    }
}
