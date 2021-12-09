package fr.SeimeExo.dtos.seismes;


public class SeismeDeleteDTO {
    private String id;


    public SeismeDeleteDTO() {
    }

    public SeismeDeleteDTO(String id, String nom, String code) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

