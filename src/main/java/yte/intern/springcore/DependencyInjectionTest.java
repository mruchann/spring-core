package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yte.intern.springcore.injection.ConstructorInjection;
import yte.intern.springcore.injection.FieldInjection;
import yte.intern.springcore.injection.SetterInjection;

@Component
public class DependencyInjectionTest {

    @Autowired
    private FieldInjection fieldInjection;

    private SetterInjection setterInjection;

    private ConstructorInjection constructorInjection;

    @Autowired
    public void setSetterInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }

    @Autowired
    public DependencyInjectionTest(ConstructorInjection constructorInjection) {
        this.constructorInjection = constructorInjection;
    }

    public void print() {
        fieldInjection.print();
        setterInjection.print();
        constructorInjection.print();
    }
}
