package com.ejemplo.simulador.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador simple para probar la configuración del microservicio.
 */
@RestController
public class HelloController {

    // Se inyecta el valor desde ConfigMap (app.message)
    @Value("${app.message:Mensaje por defecto}")
    private String message;

    @GetMapping("/hello")
    public String hello() {
        return "Mensaje desde microservicio: " + message;
    }
}
