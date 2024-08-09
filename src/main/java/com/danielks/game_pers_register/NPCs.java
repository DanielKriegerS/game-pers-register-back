package com.danielks.game_pers_register;

import com.danielks.game_pers_register.entities.NPCType;
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

    public NPCs() {
    }

    public NPCs(UUID id, int level, NPCType type) {
        this.id = id;
        this.level = level;
        this.type = type;
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
