package com.example.tyraye.dennis.demo;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "film")

public class Film {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int film_id;
    private String title;
    private String description;
    private Integer release_year;
    private Integer length;
    private String rating;
    // private String special_features;
    private int language_id;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_actor",
            joinColumns = {
                    @JoinColumn(name = "film_id", referencedColumnName = "film_id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id",
                            nullable = false, updatable = false)})
    private Set<Actor> actor = new HashSet<>();




        public Film(String title,
                    String description,
                    int length,
                    String rating,
                    int release_year,
                    int language_id){

        this.title=title;
        this.description=description;
        this.length=length;
        this.rating=rating;
        this.release_year=release_year;
        this.language_id=language_id;

    }

    public Film(){

    }


    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getFilm_id() {
        return film_id;
    }



    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }



    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }



    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
    }


















}
