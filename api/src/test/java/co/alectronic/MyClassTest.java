package co.alectronic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyClassTest {
	@Test
	void testMyClass() {
		MyClass myClass = new MyClass();
		assertThat(myClass.getMessage()).isEqualTo("Hello World!");
	}
}