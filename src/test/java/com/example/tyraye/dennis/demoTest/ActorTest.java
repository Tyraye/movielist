package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.example.tyraye.dennis.demo.Actor;

import java.util.HashSet;
import java.util.Set;


public class ActorTest {

    Actor actorTest = new Actor("FirstName","LastName");

    @Test
    void getAndSetNameTest() {
        actorTest.setFirst_name("FirstChange");
        actorTest.setLast_name("LastChange");
        assertEquals("FirstChange",actorTest.getFirst_name(),"The first name is not correct");
        assertEquals("LastChange",actorTest.getLast_name(),"The last name is not correct");
    }

    @Test
    void Actor_id() {
        actorTest.setActor_id(1);
        assertEquals(1,actorTest.getActor_id(),"This test has failed");
    }

    @Test
    public void testFirstName() {

        Actor testFirstName = new Actor();
        testFirstName.setFirst_name("Pen");
        assertEquals("Pen", testFirstName.getFirst_name(), "First name is wrong");
    }

    @Test
    public void testLastName(){

        Actor testLastName = new Actor();
        testLastName.setLast_name("Island");
        assertEquals("Island", testLastName.getLast_name(), "Last name is incorrect");
    }

    @Test
    public void test_constructor() {
        assertTrue(actorTest instanceof Actor, "Not an instance of Actor");
    }

    private Set<Film> testFilmSet = new HashSet<>() {{
        add(new Film("1", "1", 1, "PG-13", 2003, 1));
    }};

    Actor testActor = new Actor("me", "you");



    @Test
    void emptyConstructorTest() {
        Actor actor = new Actor();
        assertTrue(actor instanceof Actor,"This test has failed");
    }




}
