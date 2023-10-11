package yte.intern.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = run(SpringCoreApplication.class, args);
		ComponentTest bean = context.getBean(ComponentTest.class);
		bean.print();
	}

}
