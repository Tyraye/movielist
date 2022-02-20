package com.example.tyraye.dennis.demo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {

    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private int actor_id;
    private String first_name;
    private String last_name;



    @ManyToMany(mappedBy = "actor", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Film> films = new HashSet<>();



    public Actor(Integer actor_id, String first_name, String last_name){

        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;

    }


    public Actor(){

    }

    public Actor(String firstName, String secondName) {

    }

    public int getActor_id() {
        return actor_id;
    }


    public Set<Film> getFilms() {
        return films;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
