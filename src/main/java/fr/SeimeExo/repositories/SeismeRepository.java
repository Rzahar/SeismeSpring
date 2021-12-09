package fr.SeimeExo.repositories;

import fr.SeimeExo.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeismeRepository extends MongoRepository <Seisme, String> {
Optional<Seisme> findById(String id);
Long DeleteById(String value);
}
