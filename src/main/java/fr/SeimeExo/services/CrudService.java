package fr.SeimeExo.services;

import fr.SeimeExo.entities.Pays;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CrudService <T,S,U,D> {
    public List<T> findAll();

    public T find(String id);

    public T save(S obj);

    public T update(U obj);

    public void delete(D obj);
}
