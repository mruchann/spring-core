package yte.intern.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootTest
class SpringCoreApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		ApplicationContext context = run(SpringCoreApplication.class, args);

		ComponentTest bean = context.getBean(ComponentTest.class);
		bean.print();

		DependencyInjectionTest test = context.getBean(DependencyInjectionTest.class);
		test.print();
	}

}
