package br.edu.ifto.sistemalocadoraveiculo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CPF
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String cpf;
}