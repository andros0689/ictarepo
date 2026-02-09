package com.icta.ocp.testing_compilers.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyRestController {

    @GetMapping(value = "/mypath", produces = "application/json")
    public String greetings () {
        return "{\"hola\": \"Mi saludito\"}";
    }
}
