package com.microservice.hpmicroservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ALUNOS")
public class AlunoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "serie")
    private String serie;
    @Column(name = "chave_casa")
    private String chaveCasa;
}
