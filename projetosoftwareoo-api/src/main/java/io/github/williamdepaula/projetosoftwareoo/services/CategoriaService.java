package io.github.williamdepaula.projetosoftwareoo.services;

import io.github.williamdepaula.projetosoftwareoo.domain.Categoria;
import io.github.williamdepaula.projetosoftwareoo.repositories.CategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);

        return obj.orElse(null);

    }
}
