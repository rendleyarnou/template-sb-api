package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@ToString(callSuper = true)
@SuperBuilder
public class UsuarioJpa extends PessoaJpa {
    @NotBlank
    @Column(nullable = false)
    private String senha;

    public UsuarioJpa(String nome, String cpf, OffsetDateTime dataNascimento, EnderecoJpa endereco, ContatoJpa contato,
                      String senha) {
        super(nome, cpf, dataNascimento, endereco, contato);
        this.senha = senha;
    }
}
