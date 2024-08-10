package com.danielks.game_pers_register.entities.abrstracts;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractType {
    @Id
    protected UUID id;
    protected int physicalStrength;
    protected int rangedStrength;
    protected String combatStance;

    public AbstractType() {
    }

    public AbstractType(UUID id, int physicalStrength, int rangedStrength, String combatStance) {
        this.id = id;
        this.physicalStrength = physicalStrength;
        this.rangedStrength = rangedStrength;
        this.combatStance = combatStance;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getPhysicalStrength() {
        return physicalStrength;
    }

    public void setPhysicalStrength(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public int getRangedStrength() {
        return rangedStrength;
    }

    public void setRangedStrength(int rangedStrength) {
        this.rangedStrength = rangedStrength;
    }

    public String getCombatStance() {
        return combatStance;
    }

    public void setCombatStance(String combatStance) {
        this.combatStance = combatStance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractType that = (AbstractType) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
