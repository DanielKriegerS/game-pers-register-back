package com.danielks.game_pers_register.entities;

import com.danielks.game_pers_register.entities.abrstracts.AbstractSkill;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class ActiveSkill extends AbstractSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public ActiveSkill() {
        super();
    }

    public ActiveSkill(UUID id, String name, int skillValue) {
        super(id, name, skillValue);
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
        ActiveSkill that = (ActiveSkill) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
