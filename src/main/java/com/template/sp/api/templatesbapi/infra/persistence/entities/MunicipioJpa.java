package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "municipio")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "municipio_id_gen", sequenceName = "municipio_id_seq", allocationSize = 1)
@JsonRootName("municipio")
@ToString(callSuper = true, exclude = {"estado"})
@Immutable
public class MunicipioJpa extends AbstractEntityJpa {
    @Size(max = 60)
    @NotBlank
    private String nome;

    @Column(name = "codigoIbge")
    @NotBlank
    private String ibge;

    @Valid
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id")
    @JsonIgnore
    private EstadoJpa estado;
}
