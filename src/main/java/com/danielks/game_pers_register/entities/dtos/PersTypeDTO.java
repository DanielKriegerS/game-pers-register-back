package com.danielks.game_pers_register.entities.dtos;

import com.danielks.game_pers_register.entities.ActiveSkill;
import com.danielks.game_pers_register.entities.MagicSkill;
import com.danielks.game_pers_register.entities.PassiveSkill;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record PersTypeDTO(
        UUID id,
        @NotEmpty(message = "força física não informada") int physicalStrength,
        @NotEmpty(message = "força a distância não informada") int rangedStrength,
        @NotEmpty(message = "estilo de combate não informado") String combatStance,
        @NotNull ActiveSkill activeSkill,
        @NotNull PassiveSkill passiveSkill,
        @NotNull MagicSkill magicSkill
        ) {
}
