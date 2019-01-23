package helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//@RequestMapping(value="/")
	@GetMapping(value="/welcome")
	public String Hello(){
		return "Hello Rekha Soni";
	}
}
