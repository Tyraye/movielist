package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Actor;
import com.example.tyraye.dennis.demo.Film;
import com.example.tyraye.dennis.demo.FilmRepository;
import com.example.tyraye.dennis.demo.Language;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilmTest {

    Film filmTest = new Film("FilmTest","Test Description",120,
            "PG-13",2001,1);




    @Test
    void getFilm_id() {
        assertEquals(0,filmTest.getFilm_id(),"This test has failed");
    }

    @Test
    void getTitle() {
        assertEquals("FilmTest",filmTest.getTitle(),"This test has failed");
    }

    @Test
    void setTitle() {
        filmTest.setTitle("Title2");
        assertEquals("Title2",filmTest.getTitle(),"This test has failed");
    }

    @Test
    void getDescription() {
        assertEquals("Test Description",filmTest.getDescription(),"This test has failed");
    }

    @Test
    void setDescription() {
        filmTest.setDescription("DescriptionChange");
        assertEquals("DescriptionChange",filmTest.getDescription(),"This test has failed");
    }

    @Test
    void getRelease_year() {
        assertEquals(2001,filmTest.getRelease_year(),"This test has failed");
    }

    @Test
    void setRelease_year() {
        filmTest.setRelease_year(1998);
        assertEquals(1998,filmTest.getRelease_year(),"This test has failed");
    }

    @Test
    void getLength() {
        assertEquals(120,filmTest.getLength(),"This test has failed");
    }

    @Test
    void setLength() {
        filmTest.setLength(100);
        assertEquals(100,filmTest.getLength(),"This test has failed");
    }

    @Test
    void getRating() {
        assertEquals("PG-13",filmTest.getRating(),"This test has failed");
    }

    @Test
    void setRating() {
        filmTest.setRating("U");
        assertEquals("U",filmTest.getRating(),"This test has failed");
    }


    @Test
    void getActorTest(){
        Set<Actor> testSet = new HashSet<>();
        testSet.add(new Actor("FirstName","SecondName"));
        filmTest.setActor(testSet);
        assertEquals(testSet,filmTest.getActor(),"This test has failed");

    }


    @Test
    void emptyConstructorTest() {
        Film film = new Film();
        assertTrue(film instanceof Film,"This test has failed");
    }

}
