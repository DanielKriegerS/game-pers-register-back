package com.danielks.game_pers_register.entities.DTOs;

import com.danielks.game_pers_register.entities.Equipments;
import com.danielks.game_pers_register.entities.Game;
import com.danielks.game_pers_register.entities.PersType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record PersDTO(
        UUID id,
        @NotEmpty(message = "nome do personagem não informado") String name,
        @NotEmpty(message = "nível do personagem não informado") int level,
        @NotNull PersType persType,
        @NotEmpty(message = "carisma não informado") int charisma,
        @NotNull List<Equipments> equipments,
        @NotNull Game game
        ) {
}
