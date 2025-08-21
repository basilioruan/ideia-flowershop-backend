package com.ideiaflowershop.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(length = 100)
    private String name;

    @NotNull
    @Column(length = 250)
    private String descricao;
    
    @Column(length = 500)
    private String img;
    
    @NotNull
    @Column(precision = 10, scale = 2)
    private BigDecimal preco;
    
    @NotNull
    @Column(length = 50)
    private String categoria;
    
    @NotNull
    @Column
    private boolean disponivel;
    
    @NotNull
    @Column
    private boolean prontaEntrega;
}
