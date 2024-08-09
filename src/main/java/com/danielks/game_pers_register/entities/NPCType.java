package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.interfaces.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class NPCType implements Type {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int physicalStrength;
    private int rangedStrength;
    private String combatStance;
    private int magicDefense;

    public NPCType() {
    }

    public NPCType(UUID id, int physicalStrength, int rangedStrength, String combatStance, int magicDefense) {
        this.id = id;
        this.physicalStrength = physicalStrength;
        this.rangedStrength = rangedStrength;
        this.combatStance = combatStance;
        this.magicDefense = magicDefense;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPhysicalStrength(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public void setRangedStrength(int rangedStrength) {
        this.rangedStrength = rangedStrength;
    }

    public void setCombatStance(String combatStance) {
        this.combatStance = combatStance;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NPCType npcType = (NPCType) o;
        return id.equals(npcType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int getPhysicalStrength() {
        return 0;
    }

    @Override
    public int getRangedStrength() {
        return 0;
    }

    @Override
    public String getCombatStance() {
        return null;
    }
}
