package io.github.williamdepaula.projetosoftwareoo.repositories;

import io.github.williamdepaula.projetosoftwareoo.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
