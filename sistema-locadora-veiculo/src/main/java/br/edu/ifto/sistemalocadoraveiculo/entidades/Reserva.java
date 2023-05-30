package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    
    @NotNull
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    @NotNull
    private LocalDateTime dataHoraRetiradaEsperada;

    @NotNull
    private LocalDateTime dataHoraDevolucaoEsperada;

    @ManyToOne
    @NotNull
    @OneToOne
    private Cliente cliente;

    @ManyToOne
    @NotNull private  Locadora locadoraRetirada;

    @ManyToOne
    @NotNull private  Locadora locadoraDevolucao;

    @ManyToOne
    @NotNull private Veiculo Veiculo;
}

