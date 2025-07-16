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
public class Pessoa extends AbstractEntity {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Contato contato;
    private Endereco endereco;

    public Pessoa(
            Long id, UUID codigo, Boolean ativo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao,
            String nome, String cpf, String dataNascimento,  Contato contato, Endereco endereco) {
        super(id, codigo, ativo, dataCadastro, dataAtualizacao);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
    }
}
