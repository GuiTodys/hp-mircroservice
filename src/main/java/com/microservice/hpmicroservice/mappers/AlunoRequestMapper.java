package com.microservice.hpmicroservice.mappers;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.payloads.AlunoRequest;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoRequestMapper {
    AlunoRequestMapper INSTANCE = Mappers.getMapper(AlunoRequestMapper.class);

    Aluno toDomain(AlunoRequest alunoRequest);

    @InheritInverseConfiguration
    AlunoRequest toRequest(Aluno aluno);
}
