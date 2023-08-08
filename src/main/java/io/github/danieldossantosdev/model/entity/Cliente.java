package io.github.danieldossantosdev.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Data

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(nullable = false,length = 150)
    private String nome;
    @Getter
    @Column(nullable = false,length = 11)
    private String cpf;
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;


}