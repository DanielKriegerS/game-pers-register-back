package com.danielks.game_pers_register.entities.abrstracts;

import java.util.Objects;
import java.util.UUID;

public abstract class AbstractSkill {
    protected UUID id;
    protected String name;
    protected int skillValue;

    public AbstractSkill() {
    }

    public AbstractSkill(UUID id, String name, int skillValue) {
        this.id = id;
        this.name = name;
        this.skillValue = skillValue;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(int skillValue) {
        this.skillValue = skillValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSkill that = (AbstractSkill) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
