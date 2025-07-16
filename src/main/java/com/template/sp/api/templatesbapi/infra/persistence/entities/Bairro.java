package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "seq", sequenceName = "estado_id_seq", allocationSize = 1)
@JsonRootName("bairro")
public class Bairro extends AbstractEntity {
    @NotBlank
    private String nome;

    @ManyToOne
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;
}
