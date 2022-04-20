package com.microservice.hpmicroservice.services.aluno;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.mappers.AlunoEntityMapper;
import com.microservice.hpmicroservice.mappers.AlunoResponseWithHouseMapper;
import com.microservice.hpmicroservice.payloads.AlunoResponseWithHouse;
import com.microservice.hpmicroservice.payloads.HouseDetails;
import com.microservice.hpmicroservice.repositories.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultarAluno {
    private final ConsultarInformacoesCasa consultarInformacoesCasa;
    private final AlunoRepository alunoRepository;
    private final AlunoEntityMapper alunoEntityMapper = AlunoEntityMapper.INSTANCE;
    private final AlunoResponseWithHouseMapper alunoWithHouseMapper = AlunoResponseWithHouseMapper.INSTANCE;

    public AlunoResponseWithHouse execute(Long id) {
        Aluno aluno = alunoEntityMapper.toDomain(alunoRepository.findById(id).orElseThrow());
        HouseDetails houseDetails = consultarInformacoesCasa.execute(aluno.getChaveCasa());
        return alunoWithHouseMapper.toAlunoResponseWithHouse(aluno, houseDetails);
    }
}
