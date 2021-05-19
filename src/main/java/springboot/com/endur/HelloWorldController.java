package springboot.com.endur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello!!!";
	}
	
	@GetMapping("/user/{name}")
	public String sayHelloUser(@PathVariable String name) {
		return "Hello!!! " + name;
	}

}
