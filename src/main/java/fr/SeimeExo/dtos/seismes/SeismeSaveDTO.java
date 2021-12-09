package fr.SeimeExo.dtos.seismes;

public class SeismeSaveDTO {
    private String id;
    private String nom;
    private String code;
    private SeismeSaveDTO seisme;

    public SeismeSaveDTO() {
    }

    public SeismeSaveDTO(String id, String nom, String code, SeismeSaveDTO seisme) {
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

    public SeismeSaveDTO getSeisme() {
        return seisme;
    }

    public void setSeisme(SeismeSaveDTO seisme) {
        this.seisme = seisme;
    }
}