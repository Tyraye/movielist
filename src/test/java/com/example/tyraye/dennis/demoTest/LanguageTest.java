package com.example.tyraye.dennis.demoTest;

import com.example.tyraye.dennis.demo.Language;
import org.junit.jupiter.api.Test;


public class LanguageTest {



    @Test
    void SetNameTest(){
        Language testLanguage = new Language();
        equals(testLanguage.getLanguage_id(), 1, "Wrong language");


    }

    private void equals(int language_id, int i, String wrong_language) {
    }


}
