package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
@Getter
@Setter
@ToString(exclude = {"bairro"})
public class EnderecoJpa {
    @ManyToOne(fetch = FetchType.LAZY)
    private BairroJpa bairro;

    private String logradouro;

    @Column(name = "logradouro_numero")
    private String logradouroNumero;

    private String complemento;

    private String cep;

}
