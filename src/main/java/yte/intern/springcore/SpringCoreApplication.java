package yte.intern.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = run(SpringCoreApplication.class, args);

		ComponentTest componentTest = context.getBean(ComponentTest.class);
		//componentTest.print();

		DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
		//dependencyInjectionTest.print();

		BeanLifecycleTest beanLifecycleTest = context.getBean(BeanLifecycleTest.class);
		//beanLifecycleTest.print();

		InjectionTest injectionTest = context.getBean(InjectionTest.class);
		injectionTest.print();
	}

}
