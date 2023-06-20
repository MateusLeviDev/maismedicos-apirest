package com.levi.controller;

import com.levi.medico.DadosCadastroMedico;
import com.levi.medico.DadosListagemMedico;
import com.levi.medico.Medico;
import com.levi.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico) {
        medicoRepository.save(new Medico(dadosCadastroMedico));
    }

    //page give the pageable information. list and infos
    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable pageable) {
        return medicoRepository.findAll(pageable).map(DadosListagemMedico::new);
    }
}
