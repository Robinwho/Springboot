import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
//import org.springframework.boot.bind
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Hello {
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Hello.class, args);
	}
}