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
import static org.mockito.Mockito.verify;

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

}
