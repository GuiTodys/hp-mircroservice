package com.microservice.hpmicroservice.mappers;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.payloads.AlunoRequest;
import com.microservice.hpmicroservice.payloads.AlunoResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoResponseMapper {
    AlunoResponseMapper INSTANCE = Mappers.getMapper(AlunoResponseMapper.class);

    Aluno toDomain(AlunoResponse alunoResponse);

    @InheritInverseConfiguration
    AlunoResponse toResponse(Aluno aluno);
}
