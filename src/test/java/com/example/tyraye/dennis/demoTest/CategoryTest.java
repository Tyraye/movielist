package com.example.tyraye.dennis.demoTest;

import org.junit.jupiter.api.Test;


import com.example.tyraye.dennis.demo.Category;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoryTest {


    Category testCategory = new Category();


    @Test
    void getAndSetNameTest() {
        testCategory.setName("NewTestCategory");
        assertEquals("NewTestCategory",testCategory.getName(),"The test has failed");

    }


    @Test
    void getCategory_id() {
        assertEquals(0,testCategory.getCategory_id(),"This test has failed");
    }

    @Test
    void emptyConstructorTest() {
        assertTrue(testCategory != null,"This test has failed");
    }







}
