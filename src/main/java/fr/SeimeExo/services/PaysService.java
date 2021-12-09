package fr.SeimeExo.services;

import fr.SeimeExo.dtos.pays.PaysDTO;
import fr.SeimeExo.dtos.pays.PaysDeleteDTO;
import fr.SeimeExo.dtos.pays.PaysSaveDTO;
import fr.SeimeExo.dtos.pays.PaysUpdateDTO;
import fr.SeimeExo.entities.Pays;
import fr.SeimeExo.repositories.PaysRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaysService implements  CrudService<PaysDTO, PaysSaveDTO, PaysUpdateDTO, PaysDeleteDTO> {

    @Autowired
    PaysRepository repository;
    @Autowired
    ModelMapper mapper;


    @Override
    public List<PaysDTO> findAll() {
        List<PaysDTO> paysDTOS = new ArrayList<>();
        this.repository.findAll().forEach(pays -> {
        paysDTOS.add(mapper.map(pays, PaysDTO.class));
        });
        return paysDTOS;
    }

    @Override
    public PaysDTO find(String id) {
        Optional<Pays> u = repository.findById(id);
        PaysDTO paysDTO = null;
        if (u.isPresent()) {
            paysDTO = mapper.map(u, PaysDTO.class);
        }
        return paysDTO;

    }

    @Override
    public PaysDTO save(PaysSaveDTO obj) {
        Pays paysToSave =  mapper.map(
                obj,
                Pays.class
        );
        Pays pays = repository.save(paysToSave);
        PaysDTO paysSaved = mapper.map(pays, PaysDTO.class);
        return paysSaved;
    }

    @Override
    public PaysDTO update(PaysUpdateDTO obj) {
        Pays paysToUpdate =  mapper.map(
                obj,
                Pays.class
        );
        Pays pays = repository.save(paysToUpdate);
        PaysDTO paysSaved = mapper.map(pays, PaysDTO.class);
        return paysSaved;
    }

    @Override
    public void delete(PaysDeleteDTO obj) {
        Pays paysToSave =  mapper.map(
                obj,
                Pays.class
        );
        repository.delete(paysToSave);
    }
}
