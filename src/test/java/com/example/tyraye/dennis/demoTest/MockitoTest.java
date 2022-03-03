package com.example.tyraye.dennis.demoTest;
import com.example.tyraye.dennis.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.validator.ValidateWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    private MoviedatabaseApplication moviedatabaseApplication;

    @Mock /// creates a fake version of the language repo.
    private LanguageRepository languageRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ActorRepository actorRepository;


    @BeforeEach // sets up fake database with empty data
    void Setup(){

        moviedatabaseApplication = new MoviedatabaseApplication(
                languageRepository,
                filmRepository,
                categoryRepository,
                actorRepository);

    }

    // tests to see if
    @Test
    public void testAddLanguage(){

        Language saveLanguage = new Language("Test language"); // posts data into mock database, ("firstname","lastname")
        String expected = "save";
        String actual = moviedatabaseApplication.addLanguage(saveLanguage.getName()); // ("getfirstmane,getlastname")

        //Holds onto the data in the mock database
        ArgumentCaptor<Language>languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);

        // Saves the data and recalls it from the captor
        verify(languageRepository).save(languageArgumentCaptor.capture());

        languageArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data has been incorrectly input into the mock database");


    }

    @Test
    public void testAddCategory() {
        Category saveCategory = new Category("Anime");
        String expected = "save"; //response
        String actual = moviedatabaseApplication.addCategory(saveCategory.getCategory_id(), saveCategory.getName());
        ArgumentCaptor<Category> categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class); //holds data temporarily
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "The data has not been entered into the mock DB");
    }

    @Test
    public void testAddFilm(){
        Film saveFilm = new Film("new Movie Title","New Movie Description", 210, "R", 2012,1);
        String expected = "save";
        String actual = moviedatabaseApplication.addFilm(saveFilm.getTitle(),saveFilm.getDescription(),saveFilm.getRelease_year(),saveFilm.getLength(),saveFilm.getRating(),saveFilm.getFilm_id());
        ArgumentCaptor<Film> filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(filmArgumentCaptor.capture());
        filmArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Film data has not been inputted into the MOCK DATABASE");

    }


    @Test
    public void testGetLanguage(){
        {
            Language language1 = new Language ("TestLOne");
            Language language2 = new Language ("TestLTwo");
            List<Language> languageList = new ArrayList<>();
            languageList.add(language1);
            languageList.add(language2);
            when(moviedatabaseApplication.getAllLanguages()).thenReturn(languageList);
            Assertions.assertEquals(languageList,moviedatabaseApplication.getAllLanguages(),"Get language test has failed");
        }
    }



//    @Test
//    public void testGetFilmById(){
//        Film testFilm = new Film("title", "description", 222, "PG-13", 2018, 1);
//        when(MoviedatabaseApplication.getFilmByID(1)).thenReturn(Optional.of(testFilm));
//        Assertions.assertEquals(Optional.of(testFilm), MoviedatabaseApplication.getFilmByID(1), "This Film Id getting test has failed");
//    }


//    @Test
//    void canGetAllFilm() {
//        //when
//        Film underTest = new Film();
//        underTest.getAllFilm();
//        //then
//        verify(filmRepository).findAll();
//
//    }


}
