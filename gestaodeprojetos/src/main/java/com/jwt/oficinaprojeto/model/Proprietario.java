package com.jwt.oficinaprojeto.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Builder
public class Proprietario extends Perfil{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_usuario")
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;

     @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id")
    private List<CartaoDeCredito> cartoesDeCredito;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id")
    private List<Veiculo> veiculos;

    @OneToOne
    private Endereco endereco;
}
