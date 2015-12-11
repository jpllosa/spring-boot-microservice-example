package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogService {

	@RequestMapping("/log")
	public void log(@RequestParam(value="m") String message, @RequestParam(value="s") String stackTrace) {
		System.out.println("message:" + message + ", stacktrace: " + stackTrace);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LogService.class, args);
	}

}
