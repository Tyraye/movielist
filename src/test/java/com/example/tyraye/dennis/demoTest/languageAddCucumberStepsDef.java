package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class languageAddCucumberStepsDef {


    private MoviedatabaseApplication movieDBapp;

    @Mock
    private LanguageRepository languageRepository;
    @Mock
    private ActorRepository actorRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private FilmRepository filmRepository;


    @BeforeEach
    void setup() {
        languageRepository = mock(LanguageRepository.class);
        actorRepository = mock(ActorRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        filmRepository = mock(FilmRepository.class);

        movieDBapp = new MoviedatabaseApplication(languageRepository, filmRepository, categoryRepository, actorRepository);
    }

    String actResult;
    String expResult = "save";

    Language storedLang;
    @Given("I have selected to add a language")
    public void i_have_selected_to_add_a_language() {
        setup();
        storedLang = new Language("LangTest");
    }
    @When("The Language is not in the Database")
    public void the_language_is_not_in_the_database() {
        actResult = movieDBapp.addLanguage(storedLang.getName());

    }
    @Then("I expect to see that the Language has been added to the database")
    public void i_expect_to_see_that_the_language_has_been_added_to_the_database() {
        Assertions.assertEquals(expResult, actResult, "Saving new language test has failed");
        ArgumentCaptor<Language> languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(languageArgumentCaptor.capture());
        languageArgumentCaptor.getValue();
    }

}
