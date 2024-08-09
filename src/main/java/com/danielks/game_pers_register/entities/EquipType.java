package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.interfaces.Type;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

public class EquipType implements Type {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String principalAtribute;
    private String secundaryAtribute;
    private String combatStance;

    public EquipType() {
    }

    public EquipType(UUID id, String principalAtribute, String secundaryAtribute, String combatStance) {
        this.id = id;
        this.principalAtribute = principalAtribute;
        this.secundaryAtribute = secundaryAtribute;
        this.combatStance = combatStance;
    }

    public UUID getId() {
        return id;
    }

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
