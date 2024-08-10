package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.PersType;
import com.danielks.game_pers_register.entities.dtos.PersTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersTypeMapper {
    PersTypeMapper INSTANCE = Mappers.getMapper(PersTypeMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    @Mapping(source = "activeSkill", target = "activeSkill")
    @Mapping(source = "passiveSkill", target = "passiveSkill")
    @Mapping(source = "magicSkill", target = "magicSkill")
    PersTypeDTO toDto(PersType persType);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    @Mapping(source = "activeSkill", target = "activeSkill")
    @Mapping(source = "passiveSkill", target = "passiveSkill")
    @Mapping(source = "magicSkill", target = "magicSkill")
    PersType toEntity(PersTypeDTO persTypeDTO);
}
