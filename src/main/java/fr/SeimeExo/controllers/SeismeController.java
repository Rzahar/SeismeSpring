package fr.SeimeExo.controllers;

import fr.SeimeExo.dtos.seismes.SeismeDTO;
import fr.SeimeExo.dtos.seismes.SeismeDeleteDTO;
import fr.SeimeExo.dtos.seismes.SeismeUpdateDTO;
import fr.SeimeExo.entities.Seisme;
import fr.SeimeExo.services.SeismeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seismes")

public class SeismeController {


    private SeismeService service;

    public SeismeController(SeismeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SeismeDTO> getSeisme() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> getSeisme(@PathVariable String id) {
        SeismeDTO seismeDTO = service.findBySlug(id);
        if (seismeDTO == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(seismeDTO);
    }

    @PostMapping()
    public SeismeDTO save(@RequestBody SeismeDTO seisme) {
        return service.save(seisme);
    }


    @PutMapping()
    public SeismeDTO update(@RequestBody SeismeUpdateDTO seisme) {
        return service.update(seisme);
    }


    @DeleteMapping()
    public ResponseEntity<Long> deleteById(@RequestBody SeismeDeleteDTO seisme) {
        Long response = this.service.deleteBySlug(seisme);
        if (response == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(response);
    }
}
