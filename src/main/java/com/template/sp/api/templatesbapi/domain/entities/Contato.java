package com.template.sp.api.templatesbapi.domain.entities;

import lombok.*;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Contato {
    private String telefone;
    private String email;

    public Contato(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }
}
