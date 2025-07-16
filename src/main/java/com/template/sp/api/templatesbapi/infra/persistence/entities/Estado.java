package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Immutable;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "seq", sequenceName = "estado_id_seq", allocationSize = 1)
@JsonRootName("estado")
@Immutable
public class Estado extends AbstractEntity {
    @NotBlank
    private String nome;

    @Column(name = "codigoIbge")
    @NotBlank
    private String ibge;

    @NotBlank
    @Column(name = "sigla")
    private String uf;
}
