package yte.intern.springcore;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    public void print() {
        System.out.println("Constructor Injection!!!");
    }
}
