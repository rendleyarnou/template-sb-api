package com.template.sp.api.templatesbapi.domain.entities;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
public abstract class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;

    @EqualsAndHashCode.Include
    private UUID codigo;

    private Boolean ativo;

    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

    public AbstractEntity(Long id, UUID codigo, Boolean ativo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
        this.id = id;
        this.codigo = codigo;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }
}
