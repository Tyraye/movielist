package com.example.tyraye.dennis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.model.ResourceNotFoundException;

import java.security.InvalidParameterException;

import java.util.Base64;
import java.util.Optional;

// http://44.203.1.40:8080/Home/AllFilms
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

	@PostMapping("/AddLanguages")
	public @ResponseBody
	String addLanguage(@RequestParam String name){

		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;

	}


	@PostMapping("/AddFilm")
	public @ResponseBody String addFilm(@RequestParam String title,
										String description,
										int release_year,
										Integer length,
										String rating,
										int language_id){

		Film addFilm = new Film(
				title,
				description,
				length,
				rating,
				release_year,
				language_id);

		filmRepository.save(addFilm);
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



	@GetMapping("/findFilm/{film_id}")
	public @ResponseBody
	Optional<Film> getFilmByID(@PathVariable int film_id){

		return filmRepository.findById(film_id);

	}



	@GetMapping("/AllCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){

		return categoryRepository.findAll();

	}



	@PostMapping("/AddCategory")
	public @ResponseBody
	String addCategory (@RequestParam String name){

		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;

	}






	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){

		return actorRepository.findAll();

	}


}
