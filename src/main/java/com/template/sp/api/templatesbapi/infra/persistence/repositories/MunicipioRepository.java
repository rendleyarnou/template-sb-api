package com.template.sp.api.templatesbapi.infra.persistence.repositories;

import com.template.sp.api.templatesbapi.infra.persistence.entities.MunicipioJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MunicipioRepository extends JpaRepository<MunicipioJpa, Long> {
    @Query("SELECT m FROM MunicipioJpa m LEFT JOIN FETCH m.estado WHERE m.id = :estadoId")
    Optional<MunicipioJpa> loadByEstadoId(Long estadoId);

    @Query("SELECT m FROM MunicipioJpa m LEFT JOIN FETCH m.estado")
    List<MunicipioJpa> loadAll();

    Optional<MunicipioJpa> loadByCodigo(UUID codigo);
}
