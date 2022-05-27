package com.microservice.hpmicroservice.payloads;

import lombok.Data;

import java.io.Serializable;

@Data
public class AlunoResponseWithHouse implements Serializable {
    private Long id;
    private String name;
    private String serie;
    private String nomeCasa;
}
