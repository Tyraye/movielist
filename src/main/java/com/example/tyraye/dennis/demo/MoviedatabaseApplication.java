package com.example.tyraye.dennis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


// http://localhost:8080/hello
// added code
@RestController

public class MoviedatabaseApplication {



	public static void main(String[] args) {
		SpringApplication.run(MoviedatabaseApplication.class, args);
	}

	///// Added code, remember to import
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		return String.format("Hello %s!", name);

	}
	


}
