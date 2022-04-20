package com.microservice.hpmicroservice.mappers;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.entities.AlunoEntity;
import com.microservice.hpmicroservice.payloads.AlunoResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoEntityMapper {
    AlunoEntityMapper INSTANCE = Mappers.getMapper(AlunoEntityMapper.class);

    Aluno toDomain(AlunoEntity alunoEntity);

    @InheritInverseConfiguration
    AlunoEntity toEntity(Aluno aluno);
}
