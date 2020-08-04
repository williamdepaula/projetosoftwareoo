package io.github.williamdepaula.projetosoftwareoo.repositories;

import io.github.williamdepaula.projetosoftwareoo.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
