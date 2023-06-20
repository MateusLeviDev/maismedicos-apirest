package com.levi.medico;

import com.levi.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(

        @NotNull
        Long id,
        String nome,
        DataAddress endereco) {
}
