package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public abstract class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codigo;

    @CreationTimestamp
    @Column(name = "data_cadastro")
    private OffsetDateTime dataCadastro;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private OffsetDateTime dataAtualizacao;

    @PrePersist
    private void gerarCodigo() {
        setCodigo(UUID.randomUUID());
    }
}
