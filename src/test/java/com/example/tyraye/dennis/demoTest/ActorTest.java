package com.example.tyraye.dennis.demoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.example.tyraye.dennis.demo.Actor;



public class ActorTest {


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
    void emptyConstructorTest() {
        Actor actor = new Actor();
        assertTrue(actor instanceof Actor,"This test has failed");
    }




}
