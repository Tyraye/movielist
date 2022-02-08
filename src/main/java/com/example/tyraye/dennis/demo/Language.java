package com.example.tyraye.dennis.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Language {




    @Id
    @GeneratedValue
    private int language_id;


    private String name;

    public Language(String name){
        this.name=name;
    }




    public Language(){

    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
