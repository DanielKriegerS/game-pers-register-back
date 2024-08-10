package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.NPCs;
import com.danielks.game_pers_register.entities.dtos.NPCsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NPCsMapper {
    NPCsMapper INSTANCE = Mappers.getMapper(NPCsMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "type", target = "npcType")
    @Mapping(source = "game", target = "game")
    NPCsDTO toDto(NPCs npcs);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "npcType", target = "type")
    @Mapping(source = "game", target = "game")
    NPCs toEntity(NPCsDTO npcsDTO);
}
