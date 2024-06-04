package com.gerenciador.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApiController {

    @GetMapping("/teste-api")
    public String Teste (){
        return "Sucesso";
    }

    @GetMapping("teste-api-benvindo")
    public String TesteBenvindo (@RequestParam(name = "nome") String nome){
       return "Olá "+nome+", seja muito Bem Vindo!";
    }
}
