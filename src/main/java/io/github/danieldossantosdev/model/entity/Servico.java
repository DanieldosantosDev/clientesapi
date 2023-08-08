package io.github.danieldossantosdev.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private Integer descricao;
    @ManyToOne
    @JoinColumn(name = "id cliente")
    private Cliente cliente;
    @Column
    private BigDecimal valor;

}
