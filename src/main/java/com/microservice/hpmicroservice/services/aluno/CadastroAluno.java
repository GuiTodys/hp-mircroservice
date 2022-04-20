package com.microservice.hpmicroservice.services.aluno;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.entities.AlunoEntity;
import com.microservice.hpmicroservice.mappers.AlunoEntityMapper;
import com.microservice.hpmicroservice.repositories.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroAluno {

    private final ConsultarCasaAluno consultarCasaAluno;
    private final AlunoRepository alunoRepository;
    private final AlunoEntityMapper alunoEntityMapper = AlunoEntityMapper.INSTANCE;

    public Aluno execute(Aluno aluno) {
        aluno.setChaveCasa(consultarCasaAluno.execute().getSortingHatChoice());
        AlunoEntity alunoEntity = alunoEntityMapper.toEntity(aluno);
        return alunoEntityMapper.toDomain(alunoRepository.save(alunoEntity));
    }
}
