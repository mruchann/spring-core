package yte.intern.springcore.injection;

import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
    public void print() {
        System.out.println("Field Injection!!!");
    }
}
