package fr.SeimeExo.controllers;

import fr.SeimeExo.dtos.pays.PaysDTO;
import fr.SeimeExo.dtos.pays.PaysDeleteDTO;
import fr.SeimeExo.dtos.pays.PaysSaveDTO;
import fr.SeimeExo.dtos.pays.PaysUpdateDTO;
import fr.SeimeExo.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pays")
public class PaysController {

    @Autowired
    PaysService service;

    @GetMapping("{id}")
    public ResponseEntity<PaysDTO> find(@PathVariable String id) {
        PaysDTO paysDTO = service.find(id);
        if (paysDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(paysDTO);
    }

    @PostMapping
    public ResponseEntity<PaysDTO> save(@RequestBody PaysSaveDTO paysSaveDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(paysSaveDTO));
    }

    @PutMapping
    public ResponseEntity<PaysDTO> update(@RequestBody PaysUpdateDTO paysUpdateDTO) {
        return ResponseEntity.ok(service.update(paysUpdateDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody PaysDeleteDTO paysDeleteDTO) {
        service.delete(paysDeleteDTO);
        return ResponseEntity.ok(true);
    }
}

