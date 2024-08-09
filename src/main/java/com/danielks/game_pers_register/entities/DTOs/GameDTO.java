package com.danielks.game_pers_register.entities.DTOs;

import com.danielks.game_pers_register.entities.NPCs;
import com.danielks.game_pers_register.entities.Pers;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record GameDTO(
        UUID id,
        @NotEmpty(message = "título do jogo não informado") String title,
        @NotNull Date date,
        @NotNull List<Pers> pers,
        @NotNull List<NPCs> npcs,
        boolean ended,
        String resul
        ) {
}
