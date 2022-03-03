package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Film;
import org.junit.jupiter.api.Test;


import com.example.tyraye.dennis.demo.Category;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {


    Category testCategory = new Category();


    @Test
    void getAndSetNameTest() {
        testCategory.setName("NewTestCategory");
        assertEquals("NewTestCategory",testCategory.getName(),"The test has failed");

    }

    @Test
    void setCategory_idTest(){
        testCategory.setCategory_id(8);
        assertEquals(8,testCategory.getCategory_id(),"Get Category ID test has failed");
    }

    @Test
    void getCategory_idTest() {
        assertEquals(0,testCategory.getCategory_id(),"This test has failed");
    }

    @Test
    void emptyConstructorTest() {
       Category category = new Category();
       assertTrue(category instanceof Category, "Empty constructor test has failed");
    }






}
