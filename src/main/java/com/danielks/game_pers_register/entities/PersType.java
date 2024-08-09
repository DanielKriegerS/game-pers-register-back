package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.interfaces.Type;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Objects;
import java.util.UUID;

public class PersType implements Type {
    @Id
    private UUID id;

    private int physicalStrength;
    private int rangedStrength;
    private String combatStance;

    @OneToOne
    private ActiveSkill activeSkill;

    @OneToOne
    private MagicSkill magicSkill;

    @OneToOne
    private PassiveSkill passiveSkill;

    public PersType() {
    }

    public PersType(UUID id, int physicalStrength, int rangedStrength, String combatStance, ActiveSkill activeSkill, MagicSkill magicSkill, PassiveSkill passiveSkill) {
        this.id = id;
        this.physicalStrength = physicalStrength;
        this.rangedStrength = rangedStrength;
        this.combatStance = combatStance;
        this.activeSkill = activeSkill;
        this.magicSkill = magicSkill;
        this.passiveSkill = passiveSkill;
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

    public ActiveSkill getActiveSkill() {
        return activeSkill;
    }

    public void setActiveSkill(ActiveSkill activeSkill) {
        this.activeSkill = activeSkill;
    }

    public MagicSkill getMagicSkill() {
        return magicSkill;
    }

    public void setMagicSkill(MagicSkill magicSkill) {
        this.magicSkill = magicSkill;
    }

    public PassiveSkill getPassiveSkill() {
        return passiveSkill;
    }

    public void setPassiveSkill(PassiveSkill passiveSkill) {
        this.passiveSkill = passiveSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersType persType = (PersType) o;
        return id.equals(persType.id);
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
