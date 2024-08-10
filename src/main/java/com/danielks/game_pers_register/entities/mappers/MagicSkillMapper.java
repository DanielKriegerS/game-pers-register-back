package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.MagicSkill;
import com.danielks.game_pers_register.entities.dtos.MagicSkillDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MagicSkillMapper {
    MagicSkillMapper INSTANCE = Mappers.getMapper(MagicSkillMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    MagicSkillDTO toDto(MagicSkill magicSkill);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    MagicSkill toEntity(MagicSkillDTO magicSkillDTO);
}
