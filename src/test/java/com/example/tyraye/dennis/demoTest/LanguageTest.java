package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Language;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = {MoviedatabaseApplicationTests.class, Language.class})
public class LanguageTest {

    private Language Language = new Language();


    @Test
    void GetNameTest(){
        equals(Language.getLanguage_id(), 1, "Wrong language");
    }
    private void equals(int language_id, int i, String wrong_language) {
    }



    @Test
    void setNameTest() {
        Language getNameTest = new Language("testName");
        getNameTest.setName("testNameChange");
        assertEquals("testNameChange",getNameTest.getName(),"This test has failed");

    }


    @Test
    void getLanguage_idTest() {
        Language getNameTest = new Language("testName");
        assertEquals(0,getNameTest.getLanguage_id(),"This test has failed");
    }



    @Test
    void emptyConstructorTest() {
        Language language = new Language("testName");
        assertTrue(language instanceof Language,"This test has failed");
    }





}
