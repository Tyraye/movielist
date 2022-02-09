package com.example.tyraye.dennis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080/Home/AllLanguages
// http://localhost:8080/hello
// added code
@SpringBootApplication
@RestController
@RequestMapping("/Home") //Access point for the server/website
public class MoviedatabaseApplication {

	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ActorRepository actorRepository;
	//add autowired

	private String save = "save";


	//add comma and repositories
	public MoviedatabaseApplication(LanguageRepository languageRepository, FilmRepository filmRepository, CategoryRepository categoryRepository, ActorRepository actorRepository){

		this.languageRepository = languageRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
		this.actorRepository = actorRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(MoviedatabaseApplication.class, args);
	}

	@PostMapping("/AllLanguages")
	public @ResponseBody String AddLanguage(@RequestParam String name){

		Language addLanguage = new Language();
		languageRepository.save(addLanguage);
				return save;


	}


//	Language createLanguage(@Validated @RequestBody Language newLanguage) {
//
//		return languageRepository.save(newLanguage);
//
//	}

	@GetMapping("/AllLanguages") //Access point for the language command, defines Languages class
	public @ResponseBody
	Iterable<Language> getAllLanguages(){

		return languageRepository.findAll();

	}
	
	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){

		return filmRepository.findAll();

	}

	@GetMapping("/AllCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){

		return categoryRepository.findAll();

	}

	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){

		return actorRepository.findAll();

	}


}
