package com.danielks.game_pers_register.entities.dtos;

import com.danielks.game_pers_register.entities.EquipType;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record EquipmentsDTO(
    UUID id,
    @NotEmpty(message = "Nome do equipamento não informado") String name,
    EquipType equipType,
    @NotEmpty(message = "Valor do equipamento não informado") int typeValue,
    @NotEmpty(message = "Nível do equipamento não informado") int level
) {
}
