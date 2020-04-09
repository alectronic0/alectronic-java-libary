package co.alectronic.test.app;

import co.alectronic.MyClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestSpringController {
	@Autowired
	public MyClass myClass;

	@RequestMapping(value = "/call")
	public String call() {
		return myClass.getMessage();
	}
}
