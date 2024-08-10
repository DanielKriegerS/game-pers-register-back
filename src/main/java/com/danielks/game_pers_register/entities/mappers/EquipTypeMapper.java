package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.EquipType;
import com.danielks.game_pers_register.entities.dtos.EquipTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EquipTypeMapper {
    EquipTypeMapper INSTANCE = Mappers.getMapper(EquipTypeMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "principalAtribute", target = "principalAtribute")
    @Mapping(source = "secundaryAtribute", target = "secundaryAtribute")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    EquipTypeDTO toDto(EquipType equipType);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "principalAtribute", target = "principalAtribute")
    @Mapping(source = "secundaryAtribute", target = "secundaryAtribute")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    EquipType toEntity(EquipTypeDTO equipTypeDTO);
}
