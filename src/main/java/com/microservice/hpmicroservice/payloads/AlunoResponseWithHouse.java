package com.microservice.hpmicroservice.payloads;

import lombok.Data;

@Data
public class AlunoResponseWithHouse {
    private Long id;
    private String name;
    private String serie;
    private String nomeCasa;
}
