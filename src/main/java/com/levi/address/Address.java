package com.levi.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Address {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Address(DataAddress dataAddress) {
        this.logradouro = dataAddress.logradouro();
        this.bairro = dataAddress.bairro();
        this.cep = dataAddress.cep();
        this.uf = dataAddress.uf();
        this.cidade = dataAddress.cidade();
        this.numero = dataAddress.numero();
        this.complemento = dataAddress.complemento();
    }
}
