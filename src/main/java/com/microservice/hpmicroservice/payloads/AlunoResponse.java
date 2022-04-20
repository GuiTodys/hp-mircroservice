package com.microservice.hpmicroservice.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlunoResponse {
    private Long id;
    private String name;
    private String serie;
    private String chaveCasa;
}
