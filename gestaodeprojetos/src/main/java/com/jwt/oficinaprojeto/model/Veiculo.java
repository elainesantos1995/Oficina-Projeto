package com.jwt.oficinaprojeto.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Builder
public class Veiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String placa;
    private String ano;
    private String cor;
    private String chassi;
    private Proprietario proprietario;
    private Calendar dataProximaRevisao;
    private Calendar dataProximaTrocaOleo;
}