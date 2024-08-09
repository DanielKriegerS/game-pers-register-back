package com.danielks.game_pers_register.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class NPCs {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int level;
    @ManyToOne
    @JoinColumn(name = "npcs_type_id")
    private NPCType type;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    public NPCs() {
    }

    public NPCs(UUID id, int level, NPCType type, Game game) {
        this.id = id;
        this.level = level;
        this.type = type;
        this.game = game;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public NPCType getType() {
        return type;
    }

    public void setType(NPCType type) {
        this.type = type;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NPCs npCs = (NPCs) o;
        return id.equals(npCs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
