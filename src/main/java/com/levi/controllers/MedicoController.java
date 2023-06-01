package com.levi.controllers;

import com.levi.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping //call cadastrar method
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }
}
