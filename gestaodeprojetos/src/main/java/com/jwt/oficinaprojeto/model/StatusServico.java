package com.projeto.oficina.model;

import lombok.Getter;

@Getter
public enum StatusServico {
    
    NAO_INICIADO ("Não iniciado"), 
    NA_FILA ("Na fila"), 
    EM_ANDAMENTO ("Em andamento"), 
    EM_ESPERA ("Em espera"), 
    CONCLUIDO ("Concluído"), 
    ENTREGUE("Entregue"),
    ENCERRADO("Encerrado");

    String nomeStatus;

    StatusServico(String nomeStatus){
        this.nomeStatus = nomeStatus;
    }

}
