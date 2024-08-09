package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.abrstracts.AbstractType;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class PersType extends AbstractType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private ActiveSkill activeSkill;

    @OneToOne
    private MagicSkill magicSkill;

    @OneToOne
    private PassiveSkill passiveSkill;

    public PersType() {
        super();
    }

    public PersType(UUID id, int physicalStrength, int rangedStrength, String combatStance, ActiveSkill activeSkill, MagicSkill magicSkill, PassiveSkill passiveSkill) {
        super(id, physicalStrength, rangedStrength, combatStance);
        this.activeSkill = activeSkill;
        this.magicSkill = magicSkill;
        this.passiveSkill = passiveSkill;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
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
}