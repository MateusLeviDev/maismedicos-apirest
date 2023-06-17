package com.levi.medico;

import com.levi.address.DataAddress;

public record DadosCadastroMedico(String nome, String email, String crm, Specialty specialty, DataAddress address) {
}
