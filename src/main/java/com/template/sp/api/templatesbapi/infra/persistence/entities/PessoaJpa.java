package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.OffsetDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@ToString(callSuper = true)
@MappedSuperclass
public class PessoaJpa extends AbstractEntityJpa {
    private String nome;

    @CPF
    private String cpf;

    @Column(name = "data_nascimento")
    private OffsetDateTime dataNascimento;

    @Embedded
    private EnderecoJpa endereco;

    @Embedded
    private ContatoJpa contato;
}
