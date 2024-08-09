package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.abrstracts.AbstractType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class NPCType extends AbstractType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int magicDefense;

    public NPCType() {
        super();
    }

    public NPCType(UUID id, int physicalStrength, int rangedStrength, String combatStance, int magicDefense) {
        super(id, physicalStrength, rangedStrength, combatStance);
        this.magicDefense = magicDefense;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
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
