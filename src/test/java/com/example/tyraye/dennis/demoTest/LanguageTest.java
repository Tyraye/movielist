package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Language;
import org.junit.jupiter.api.Test;


public class LanguageTest {

    private Language Language = new Language();




    @Test
    public void  SetNameTest(){


    }




    @Test
    void GetNameTest(){

        equals(Language.getLanguage_id(), 1, "Wrong language");

    }
    private void equals(int language_id, int i, String wrong_language) {
    }


}
