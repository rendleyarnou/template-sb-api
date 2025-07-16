package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
    @ManyToOne(fetch = FetchType.EAGER)
    private Bairro bairro;

    private String logradouro;

    @Column(name = "logradouro_numero")
    private String logradouroNumero;

    private String complemento;

    private String cep;

}
