package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Data
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

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    @NotBlank
    private String telefone;

    @Email
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String email;
}