package com.example.tyraye.dennis.demo;


import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int category_id;


    private String name;

    public Category(String name){
        this.name = name;
    }

    public Category(){

    }


    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
