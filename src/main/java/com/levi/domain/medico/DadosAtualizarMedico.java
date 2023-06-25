package com.levi.domain.medico;

import com.levi.domain.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(

        @NotNull
        Long id,
        String nome,
        DataAddress endereco) {
}
