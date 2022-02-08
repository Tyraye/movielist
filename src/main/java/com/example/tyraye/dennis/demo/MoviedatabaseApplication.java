package com.example.tyraye.dennis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080/Home/AllLanguages
// http://localhost:8080/hello
// added code
@SpringBootApplication
@RestController
@RequestMapping("/Home")
public class MoviedatabaseApplication {

	@Autowired
	private LanguageRepository languageRepository;

	public MoviedatabaseApplication(LanguageRepository languageRepository){

		this.languageRepository = languageRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(MoviedatabaseApplication.class, args);
	}



	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){

		return languageRepository.findAll();

	}
	


}
