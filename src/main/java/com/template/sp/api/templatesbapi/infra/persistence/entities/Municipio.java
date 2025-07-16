package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Immutable;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "seq", sequenceName = "estado_id_seq", allocationSize = 1)
@JsonRootName("municipio")
@Immutable
public class Municipio extends AbstractEntity{
    @Size(max = 60)
    @NotBlank
    private String nome;

    @Column(name = "codigoIbge")
    @NotBlank
    private String ibge;

    @Valid
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado_id")
    @JsonIgnore
    private Estado estado;
}
