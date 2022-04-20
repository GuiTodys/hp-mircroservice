package com.microservice.hpmicroservice.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor
public class Aluno {
    private Long id;
    private String name;
    private String serie;
    private String chaveCasa;
}
