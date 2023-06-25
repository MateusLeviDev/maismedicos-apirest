package com.levi.domain.medico;

import com.levi.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medico")
@Entity(name = "Medico")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id") //gerar apenas do Id
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded //ficar em uma classe separada, mas na db os campos desa classe fazem parte da mesma tabela de medicos
    private Address address;
    private boolean ativo;

    public Medico(DadosCadastroMedico dadosCadastroMedico) {
        this.ativo = true;
        this.nome = dadosCadastroMedico.nome();
        this.email = dadosCadastroMedico.email();
        this.crm = dadosCadastroMedico.crm();
        this.specialty = dadosCadastroMedico.specialty();
        this.address = new Address(dadosCadastroMedico.address());
    }

    public void atualizarInformacoes(DadosAtualizarMedico dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.endereco() != null) {
            this.address.atualizarInfo(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
