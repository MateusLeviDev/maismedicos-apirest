package com.levi.domain.medico;

public record DadosListagemMedico(Long id, String nome,String email, String crm, Specialty specialty) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getSpecialty());
    }
}
