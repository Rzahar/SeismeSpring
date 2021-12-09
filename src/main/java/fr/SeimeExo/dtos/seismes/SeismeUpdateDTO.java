package fr.SeimeExo.dtos.seismes;

public class SeismeUpdateDTO {
    private String id;
    private String nom;
    private String code;
    private SeismeUpdateDTO seisme;

    public SeismeUpdateDTO() {
    }

    public SeismeUpdateDTO(String id, String nom, String code, SeismeUpdateDTO seisme) {
        this.id = id;
        this.nom = nom;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SeismeUpdateDTO getSeisme() {
        return seisme;
    }

    public void setSeisme(SeismeUpdateDTO seisme) {
        this.seisme = seisme;
    }
}