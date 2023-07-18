package com.jwt.oficinaprojeto.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mecanico extends Perfil{
    
    @OneToMany
    private List<Veiculo> veiculos;
}
