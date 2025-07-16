package com.template.sp.api.templatesbapi.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Usuario extends Pessoa {
    private String senha;

    public Usuario(
            Long id, UUID codigo, Boolean ativo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao,
            String nome, String cpf, String dataNascimento,  Contato contato, Endereco endereco, String senha
            ) {
        super(id, codigo, ativo, dataCadastro, dataAtualizacao, nome, cpf, dataNascimento, contato, endereco);
        this.senha = senha;
    }
}
