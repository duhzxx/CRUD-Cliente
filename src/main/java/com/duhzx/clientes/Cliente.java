package com.duhzx.clientes;

import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import org.hibernate.mapping.PrimaryKey;

import java.time.LocalDate;

public class Cliente {

    @Id
    @PrimaryKeyJoinColumn
    private Long id;

    private String name;
    private String cpf;
    private Double income;
    private LocalDate birthDate;
    private Integer children;



}
