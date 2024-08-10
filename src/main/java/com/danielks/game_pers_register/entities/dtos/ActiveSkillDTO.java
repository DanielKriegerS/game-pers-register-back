package com.danielks.game_pers_register.entities.dtos;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record ActiveSkillDTO(
    UUID id,
    @NotEmpty(message = "Nome da habilidade ativa não informado") String name,
    @NotEmpty(message = "Valor da habilidade ativa não informado") int skillValue
){}