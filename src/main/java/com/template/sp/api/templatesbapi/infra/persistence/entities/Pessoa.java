package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@MappedSuperclass
@Getter
@Setter
public class Pessoa extends AbstractEntity {
    private String nome;

    @CPF
    private String cpf;

    @Column(name = "data_nascimento")
    private OffsetDateTime dataNascimento;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Contato contato;
}
