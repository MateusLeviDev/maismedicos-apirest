package com.levi.medico;

public record DadosListagemMedico(String nom,String email, String crm, Specialty specialty) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getSpecialty());
    }
}
