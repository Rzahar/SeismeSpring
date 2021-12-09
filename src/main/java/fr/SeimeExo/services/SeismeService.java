package fr.SeimeExo.services;

import fr.SeimeExo.dtos.seismes.SeismeDTO;
import fr.SeimeExo.dtos.seismes.SeismeDeleteDTO;
import fr.SeimeExo.dtos.seismes.SeismeUpdateDTO;
import fr.SeimeExo.entities.Seisme;
import fr.SeimeExo.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeismeService {

    private SeismeRepository repository;
    private ModelMapper mapper;

    public SeismeService(ModelMapper mapper,
                         SeismeRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }
    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismes = new ArrayList<>();
        repository.findAll().forEach(seisme -> {
            seismes.add(mapper.map(seisme, SeismeDTO.class));
        });
        return seismes;
    }

    public SeismeDTO save(SeismeDTO post) {
        Seisme s = this.repository.save(this.mapper.map(post, Seisme.class));
        return this.mapper.map(s, SeismeDTO.class);
    }

    public SeismeDTO findBySlug(String slug) {
        // Je crée ma variable qui va contenir mon DTO
        SeismeDTO seismeDTO = null;
        // Me renvoi un article, mais on ne sait pas s'il existe
        Optional<Seisme> optionnalSeisme = this.repository.findById(seismeDTO.getId());
        // On va vérifier si l'article existe
        if(optionnalSeisme.isPresent()) {
            // Je récupère mon article
            Seisme seisme = optionnalSeisme.get();
            // Je map mon entité Post en DTO PostDTO
            seismeDTO = mapper.map(seisme, SeismeDTO.class);
        }
        return seismeDTO;
    }

    public SeismeDTO update(SeismeUpdateDTO seismeDTO) {
        // Je map mon DTO en Entité
        Seisme seismeToSave = mapper.map(seismeDTO, Seisme.class);
        // Je save mon article
        Seisme seismeSaving = repository.save(seismeToSave);
        // Je transforme mon article en PostDTO
        SeismeDTO seismeDeRetour = mapper.map(seismeSaving, SeismeDTO.class);
        // JE retourne mon postDTO
        return seismeDeRetour;
    }

    public Long deleteBySlug(SeismeDeleteDTO post) {
        return this.repository.DeleteById(post.getId());
    }
}


