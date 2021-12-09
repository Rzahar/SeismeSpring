package fr.SeimeExo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seisme {
    @Id
    private String id;
    private String nom;
    private int magnitude;
    @DBRef
    private Seisme seisme;

    public Seisme() {
    }

    public Seisme(String id, String nom, int magnitude, Seisme seisme) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.seisme = seisme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public Seisme getSeisme() {
        return seisme;
    }

    public void setSeisme(Seisme seisme) {
        this.seisme = seisme;
    }
}