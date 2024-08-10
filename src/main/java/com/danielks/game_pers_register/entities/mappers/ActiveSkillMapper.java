package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.ActiveSkill;
import com.danielks.game_pers_register.entities.dtos.ActiveSkillDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActiveSkillMapper {
    ActiveSkillMapper INSTANCE = Mappers.getMapper(ActiveSkillMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    ActiveSkillDTO toDto(ActiveSkill activeSkill);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    ActiveSkill toEntity(ActiveSkillDTO activeSkillDTO);
}
