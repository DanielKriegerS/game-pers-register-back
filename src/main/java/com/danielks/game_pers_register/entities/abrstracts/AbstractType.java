package com.danielks.game_pers_register.entities.abrstracts;

import java.util.UUID;

public abstract class AbstractType {
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
}
