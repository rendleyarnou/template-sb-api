package com.template.sp.api.templatesbapi.infra.persistence.repositories;

import com.template.sp.api.templatesbapi.infra.persistence.entities.BairroJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BairroRepository extends JpaRepository<BairroJpa, Long> {
    @Query("SELECT b FROM BairroJpa b LEFT JOIN FETCH b.municipio m LEFT JOIN FETCH m.estado WHERE b.id = :id")
    Optional<BairroJpa> loadById(Long id);

    @Query("SELECT b FROM BairroJpa b LEFT JOIN FETCH b.municipio m LEFT JOIN FETCH m.estado")
    List<BairroJpa> loadAll();

    Optional<BairroJpa> loadByCodigo(UUID codigo);
}
