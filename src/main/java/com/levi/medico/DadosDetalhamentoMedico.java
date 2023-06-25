package com.levi.medico;

import com.levi.address.Address;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, Specialty specialty, Address address) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getSpecialty(), medico.getAddress())
    }
}
