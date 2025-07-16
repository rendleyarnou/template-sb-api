package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "estado")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "estado_id_gen", sequenceName = "estado_id_seq", allocationSize = 1)
@JsonRootName("estado")
@Getter
@Setter
@ToString(callSuper = true)
@Immutable
public class EstadoJpa extends AbstractEntityJpa {
    @NotBlank
    private String nome;

    @Column(name = "codigoIbge")
    @NotBlank
    private String ibge;

    @NotBlank
    @Column(name = "sigla")
    private String uf;
}
