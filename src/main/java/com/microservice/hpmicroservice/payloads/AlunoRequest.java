package com.microservice.hpmicroservice.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlunoRequest {
    private String name;
    private String serie;
}
