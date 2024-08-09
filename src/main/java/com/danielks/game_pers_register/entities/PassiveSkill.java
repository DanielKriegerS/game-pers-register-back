package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.abrstracts.AbstractSkill;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

public class PassiveSkill extends AbstractSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public PassiveSkill() {
        super();
    }

    public PassiveSkill(UUID id, String name, int value, UUID id1) {
        super(id, name, value);
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassiveSkill that = (PassiveSkill) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
