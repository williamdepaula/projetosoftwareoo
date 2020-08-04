package io.github.williamdepaula.projetosoftwareoo.repositories;

import io.github.williamdepaula.projetosoftwareoo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
