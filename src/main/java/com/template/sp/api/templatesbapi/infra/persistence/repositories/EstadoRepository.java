package com.template.sp.api.templatesbapi.infra.persistence.repositories;

import com.template.sp.api.templatesbapi.infra.persistence.entities.EstadoJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoJpa, Long> {
    Optional<EstadoJpa> loadByCodigo(UUID codigo);
}
