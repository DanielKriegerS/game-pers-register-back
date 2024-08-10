package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.abrstracts.AbstractType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class EquipType extends AbstractType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String principalAtribute;
    private String secundaryAtribute;
    private int lv;

    public EquipType() {
        super();
    }

    public EquipType(UUID id, int physicalStrength, int rangedStrength, String principalAtribute, String secundaryAtribute, int lv, String combatStance) {
        super(id, physicalStrength, rangedStrength, combatStance);
        this.id = id;
        this.lv = lv;
        this.principalAtribute = principalAtribute;
        this.secundaryAtribute = secundaryAtribute;
    }

    @Override
    public UUID getId() {
        return id;
    }
    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public String getPrincipalAtribute() {
        return principalAtribute;
    }

    public void setPrincipalAtribute(String principalAtribute) {
        this.principalAtribute = principalAtribute;
    }

    public String getSecundaryAtribute() {
        return secundaryAtribute;
    }

    public void setSecundaryAtribute(String secundaryAtribute) {
        this.secundaryAtribute = secundaryAtribute;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setCombatStance(String combatStance) {
        this.combatStance = combatStance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipType equipType = (EquipType) o;
        return id.equals(equipType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

    }
}
