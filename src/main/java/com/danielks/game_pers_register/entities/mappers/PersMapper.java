package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.Pers;
import com.danielks.game_pers_register.entities.dtos.PersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersMapper {
    PersMapper INSTANCE = Mappers.getMapper(PersMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "type", target = "persType")
    @Mapping(source = "charisma", target = "charisma")
    @Mapping(source = "equipments", target = "equipments")
    @Mapping(source = "game", target = "game")
    PersDTO toDto(Pers pers);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "persType", target = "type")
    @Mapping(source = "charisma", target = "charisma")
    @Mapping(source = "equipments", target = "equipments")
    @Mapping(source = "game", target = "game")
    Pers toEntity(PersDTO persDTO);
}
