package com.charamzic.dominickmapleec.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Subscriber {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Subscriber() {
    }

    @Override
    public String toString() {
        return name + " " + email;
    }
}