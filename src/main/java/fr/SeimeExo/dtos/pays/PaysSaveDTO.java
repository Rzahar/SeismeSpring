package fr.SeimeExo.dtos.pays;

import fr.SeimeExo.entities.Pays;

import java.util.List;

public class PaysSaveDTO {
    private String id;
    private String nom;
    private int magnitude;
    private List<Pays> pays;

    public PaysSaveDTO() {
    }

    public PaysSaveDTO(String id, String nom, int magnitude, List<Pays> pays) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.pays = pays;
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

    public List<Pays> getPays() {
        return pays;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
    }
}