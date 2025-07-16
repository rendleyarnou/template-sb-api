package com.template.sp.api.templatesbapi.infra.persistence.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Contato {
    private String telefone;
    private String email;
}
