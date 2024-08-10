package com.danielks.game_pers_register.entities.dtos;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record EquipTypeDTO(
    UUID id,
    @NotEmpty(message = "força física não informada") int physicalStrength,
    @NotEmpty(message = "força a distância não informada") int rangedStrength,
    @NotEmpty(message = "estilo de combate não informado") String combatStance,
    @NotEmpty(message = "atributo primário não informado") String principalAtribute,
    @NotEmpty(message = "atributo secundário não informado") String secundaryAtribute
) {
}
