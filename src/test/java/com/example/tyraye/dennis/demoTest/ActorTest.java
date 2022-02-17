package com.example.tyraye.dennis.demoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.example.tyraye.dennis.demo.Actor;



public class ActorTest {



    @Test
    public void testFirstName() {

        Actor testFirstName = new Actor();
        testFirstName.setFirst_name("Ty");
        assertEquals("Ty", testFirstName.getFirst_name(), "First name is wrong");
    }








}
