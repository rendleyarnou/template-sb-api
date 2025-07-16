package com.template.sp.api.templatesbapi.application.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
@Tag(name = "Hello world", description = "Endpoint para teste e saudação")
public class HelloController {

    @GetMapping
    @Operation(summary = "Retorna uma mensagem de saudação", description = "Este endpoint retorna uma simples mensagem de 'Hello, World!'")
    public String helloWorld() {
        return "Hello World!";
    }
}
