package com.jwt.oficinaprojeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Builder
public class CartaoDeCredito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private String validadeMes;
    private String validadeAno;
    private String cvv;
    private String nomeTitular;
    private boolean isPrincipal;
}
