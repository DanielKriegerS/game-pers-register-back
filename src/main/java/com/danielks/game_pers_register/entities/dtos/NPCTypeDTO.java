package com.danielks.game_pers_register.entities.dtos;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record NPCTypeDTO(
    UUID id,
    @NotEmpty(message = "força física não informada") int physicalStrength,
    @NotEmpty(message = "força a distância não informada") int rangedStrength,
    @NotEmpty(message = "estilo de combate não informado") String combatStance,
    @NotEmpty(message = "level não informado") int lv,
    @NotEmpty(message = "defesa mágica não informada") int magicDefense
) {
}
