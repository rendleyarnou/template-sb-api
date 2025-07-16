package com.template.sp.api.templatesbapi.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Municipio extends AbstractEntity {
    private String nome;
    private String ibge;
    private Estado estado;

    public Municipio (
            Long id, UUID codigo, Boolean ativo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao,
            String nome, String ibge, Estado estado
            ) {
        super(id, codigo, ativo, dataCadastro, dataAtualizacao);
        this.nome = nome;
        this.ibge = ibge;
        this.estado = estado;
    }

}
