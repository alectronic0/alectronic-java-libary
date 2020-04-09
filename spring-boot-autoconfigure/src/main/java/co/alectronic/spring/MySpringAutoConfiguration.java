package co.alectronic.spring;

import co.alectronic.MyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringAutoConfiguration {
	@Bean
	public MyClass myClass() {
		return new MyClass();
	}
}
