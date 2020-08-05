package io.github.williamdepaula.projetosoftwareoo.repositories;

import io.github.williamdepaula.projetosoftwareoo.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
