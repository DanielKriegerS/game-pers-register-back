package com.danielks.game_pers_register.entities.mappers;

import com.danielks.game_pers_register.entities.PassiveSkill;
import com.danielks.game_pers_register.entities.dtos.PassiveSkillDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PassiveSkillMapper {
    PassiveSkillMapper INSTANCE = Mappers.getMapper(PassiveSkillMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    PassiveSkillDTO toDto(PassiveSkill passiveSkill);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "skillValue", target = "skillValue")
    PassiveSkill toEntity(PassiveSkillDTO passiveSkillDTO);
}
