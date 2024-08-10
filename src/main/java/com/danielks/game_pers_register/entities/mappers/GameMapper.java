package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.Game;
import com.danielks.game_pers_register.entities.dtos.GameDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

        @Mapping(source = "id", target = "id")
        @Mapping(source = "title", target = "title")
        @Mapping(source = "date", target = "date")
        @Mapping(source = "pers", target = "pers")
        @Mapping(source = "npcs", target = "npcs")
        @Mapping(source = "ended", target = "ended")
        @Mapping(source = "result", target = "result")
        GameDTO toDto(Game game);

        @Mapping(source = "id", target = "id")
        @Mapping(source = "title", target = "title")
        @Mapping(source = "date", target = "date")
        @Mapping(source = "pers", target = "pers")
        @Mapping(source = "npcs", target = "npcs")
        @Mapping(source = "ended", target = "ended")
        @Mapping(source = "result", target = "result")
        Game toEntity(GameDTO gameDTO);
}
