package fr.SeimeExo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Pays {
    @Id
    private String id;
    private String nom;
    private String code;
    @DBRef
    private List<Seisme> seismes;

    public Pays() {
    }

    public Pays(String id, String nom, String code, List<Seisme> seismes) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seismes = seismes;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Seisme> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<Seisme> seismes) {
        this.seismes = seismes;
    }
}
