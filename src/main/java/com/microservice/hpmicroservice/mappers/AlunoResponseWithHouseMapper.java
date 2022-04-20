package com.microservice.hpmicroservice.mappers;

import com.microservice.hpmicroservice.domains.Aluno;
import com.microservice.hpmicroservice.payloads.AlunoResponseWithHouse;
import com.microservice.hpmicroservice.payloads.HouseDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoResponseWithHouseMapper {
    AlunoResponseWithHouseMapper INSTANCE = Mappers.getMapper(AlunoResponseWithHouseMapper.class);

    Aluno toDomain(AlunoResponseWithHouse alunoResponseWithHouse);

    @Mapping(source = "houseDetails.name", target = "nomeCasa")
    @Mapping(source = "aluno.id", target = "id")
    @Mapping(source = "aluno.name", target = "name")
    @Mapping(source = "aluno.serie", target = "serie")
    AlunoResponseWithHouse toAlunoResponseWithHouse(Aluno aluno, HouseDetails houseDetails);
}
