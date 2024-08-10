package com.danielks.game_pers_register.entities.dtos;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record MagicSkillDTO(
    UUID id,
    @NotEmpty(message = "Nome da habilidade passiva não informado") String name,
    @NotEmpty(message = "Valor da habilidade passiva não informado") int skillValue
){}