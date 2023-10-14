package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {

    private final BeanTest beanTest;
    private final ComponentTest componentTest;

    @Autowired
    public InjectionTest(BeanTest beanTest, ComponentTest componentTest) {
        this.beanTest = beanTest;
        this.componentTest = componentTest;
    }

    public void print() {
        beanTest.print();
        componentTest.print();
    }
}
