package com.template.sp.api.templatesbapi.infra.persistence.entities;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "bairro")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "bairro_id_gen", sequenceName = "bairro_id_seq", allocationSize = 1)
@JsonRootName("bairro")
@Getter
@Setter
@ToString(callSuper = true, exclude = {"municipio"})
public class BairroJpa extends AbstractEntityJpa {
    @NotBlank
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "municipio_id")
    private MunicipioJpa municipio;
}
