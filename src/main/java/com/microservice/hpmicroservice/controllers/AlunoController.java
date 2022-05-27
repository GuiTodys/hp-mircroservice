package com.microservice.hpmicroservice.controllers;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.mappers.AlunoRequestMapper;
import com.microservice.hpmicroservice.mappers.AlunoResponseMapper;
import com.microservice.hpmicroservice.mappers.AlunoResponseWithHouseMapper;
import com.microservice.hpmicroservice.payloads.AlunoRequest;
import com.microservice.hpmicroservice.payloads.AlunoResponse;
import com.microservice.hpmicroservice.payloads.AlunoResponseWithHouse;
import com.microservice.hpmicroservice.services.aluno.CadastroAluno;
import com.microservice.hpmicroservice.services.aluno.ConsultarAluno;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoRequestMapper alunoRequestMapper = AlunoRequestMapper.INSTANCE;
    private final AlunoResponseMapper alunoResponseMapper = AlunoResponseMapper.INSTANCE;
    private final AlunoResponseWithHouseMapper alunoWithHouseMapper = AlunoResponseWithHouseMapper.INSTANCE;
    private final CadastroAluno cadastroAluno;
    private final ConsultarAluno consultarAluno;

    @PostMapping
    public AlunoResponse cadastrarAluno(@RequestBody AlunoRequest alunoRequest) {
        Aluno aluno = alunoRequestMapper.toDomain(alunoRequest);
        return alunoResponseMapper.toResponse(cadastroAluno.execute(aluno));
    }

    @GetMapping("/{alunoId}")
    @Cacheable(cacheNames = "info", key = "#alunoId")
    public AlunoResponseWithHouse getAlunoInformation(
            @PathVariable Long alunoId
    ) {
        return consultarAluno.execute(alunoId);
    }
}
