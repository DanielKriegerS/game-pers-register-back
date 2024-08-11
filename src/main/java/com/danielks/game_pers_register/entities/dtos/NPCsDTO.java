package com.danielks.game_pers_register.entities.dtos;

import com.danielks.game_pers_register.entities.Game;
import com.danielks.game_pers_register.entities.NPCType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record NPCsDTO(
        UUID id,
        @NotNull NPCType npcType,
        @NotNull Game game

        ) {
}
