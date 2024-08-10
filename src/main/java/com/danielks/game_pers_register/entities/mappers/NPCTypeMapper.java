package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.NPCType;
import com.danielks.game_pers_register.entities.dtos.NPCTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NPCTypeMapper {
    NPCTypeMapper INSTANCE = Mappers.getMapper(NPCTypeMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    @Mapping(source = "magicDefense", target = "magicDefense")
    NPCTypeDTO toDto(NPCType npcType);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "physicalStrength", target = "physicalStrength")
    @Mapping(source = "rangedStrength", target = "rangedStrength")
    @Mapping(source = "combatStance", target = "combatStance")
    @Mapping(source = "magicDefense", target = "magicDefense")
    NPCType toEntity(NPCTypeDTO npcTypeDTO);
}
