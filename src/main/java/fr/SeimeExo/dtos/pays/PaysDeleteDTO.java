package fr.SeimeExo.dtos.pays;

import fr.SeimeExo.entities.Pays;

import java.util.List;

public class PaysDeleteDTO {
    private String id;


    public PaysDeleteDTO() {
    }

    public PaysDeleteDTO(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}