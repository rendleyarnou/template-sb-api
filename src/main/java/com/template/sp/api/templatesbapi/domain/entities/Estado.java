package com.template.sp.api.templatesbapi.domain.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Estado extends AbstractEntity {
    private String nome;
    private String ibge;
    private String uf;

    public Estado(
            Long id, UUID codigo, Boolean ativo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao,
            String nome, String ibge, String uf) {
        super(id, codigo, ativo, dataCadastro, dataAtualizacao);
        this.nome = nome;
        this.ibge = ibge;
        this.uf = uf;
    }
}
