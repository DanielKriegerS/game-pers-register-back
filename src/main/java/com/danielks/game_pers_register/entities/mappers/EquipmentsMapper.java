package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.Equipments;
import com.danielks.game_pers_register.entities.dtos.EquipmentsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EquipmentsMapper
{
    EquipmentsMapper INSTANCE = Mappers.getMapper(EquipmentsMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "type", target = "equipType")
    @Mapping(source = "equipmentValue", target = "equipmentValue")
    @Mapping(source = "level", target = "level")
    EquipmentsDTO toDto(Equipments equipments);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "equipType", target = "type")
    @Mapping(source = "equipmentValue", target = "equipmentValue")
    @Mapping(source = "level", target = "level")
    Equipments toEntity(EquipmentsDTO equipmentsDTO);
}
