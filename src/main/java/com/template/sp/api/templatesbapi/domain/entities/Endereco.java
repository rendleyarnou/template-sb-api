package com.template.sp.api.templatesbapi.domain.entities;

import lombok.*;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Endereco {
    private Bairro bairro;
    private String logradouro;
    private String logradouroNumero;
    private String complemento;
    private String cep;

    public Endereco(Bairro bairro, String logradouro, String logradouroNumero, String complemento, String cep) {
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.logradouroNumero = logradouroNumero;
        this.complemento = complemento;
        this.cep = cep;
    }
}
