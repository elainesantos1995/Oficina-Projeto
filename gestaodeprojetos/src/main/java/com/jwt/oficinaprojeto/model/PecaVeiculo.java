package com.jwt.oficinaprojeto.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Builder
public class PecaVeiculo {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Peca peca;

    @OneToOne
    private Veiculo veiculo;
    private Calendar quantidade;
    private BigDecimal custoUnitarioPeca;
}
