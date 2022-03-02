package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Actor;
import com.example.tyraye.dennis.demo.Film;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilmTest {

    Film filmTest = new Film("FilmTest","Test Description",120,
            "PG-13",2001,1);




    @Test
    void getFilm_idTest() {
        assertEquals(0,filmTest.getFilm_id(),"This test has failed");
    }


    @Test
    void setFilm_idTest(){
        filmTest.setFilm_id(1000);
        assertEquals(1000,filmTest.getFilm_id(),"Film ID setting has failed");
    }


    @Test
    void getTitleTest() {
        assertEquals("FilmTest",filmTest.getTitle(),"This test has failed");
    }

    @Test
    void setTitleTest() {
        filmTest.setTitle("Title2");
        assertEquals("Title2",filmTest.getTitle(),"This test has failed");
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Test Description",filmTest.getDescription(),"This test has failed");
    }

    @Test
    void setDescriptionTest() {
        filmTest.setDescription("DescriptionChange");
        assertEquals("DescriptionChange",filmTest.getDescription(),"This test has failed");
    }

    @Test
    void getRelease_yearTest() {
        assertEquals(2001,filmTest.getRelease_year(),"This test has failed");
    }

    @Test
    void setRelease_yearTest() {
        filmTest.setRelease_year(1998);
        assertEquals(1998,filmTest.getRelease_year(),"This test has failed");
    }

    @Test
    void getLanguage_idTest() {
        assertEquals(1,filmTest.getLanguage_id(),"Language ID get test has failed");
    }

    @Test
    short setLanguage_idTest(){
        filmTest.setLanguage_id(2);
        assertEquals(2,setLanguage_idTest(),"Set test failed");
        return 0;
    }


    @Test
    void getLengthTest() {
        assertEquals(120,filmTest.getLength(),"This test has failed");
    }

    @Test
    void setLengthTest() {
        filmTest.setLength(100);
        assertEquals(100,filmTest.getLength(),"This test has failed");
    }

    @Test
    void getRatingTest() {
        assertEquals("PG-13",filmTest.getRating(),"This test has failed");
    }

    @Test
    void setRatingTest() {
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
