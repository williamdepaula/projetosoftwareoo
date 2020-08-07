package io.github.williamdepaula.projetosoftwareoo.repositories;

import io.github.williamdepaula.projetosoftwareoo.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
