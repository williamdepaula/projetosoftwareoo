package io.github.williamdepaula.projetosoftwareoo.services;

import io.github.williamdepaula.projetosoftwareoo.domain.Categoria;
import io.github.williamdepaula.projetosoftwareoo.repositories.CategoriaRepository;
import io.github.williamdepaula.projetosoftwareoo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {

        Optional<Categoria> obj = categoriaRepository.findById(id);
        Categoria categoria = obj.orElseThrow(() -> {
            String msg = "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName();
            return new ObjectNotFoundException(msg);
        });
        return categoria;
    }
}
