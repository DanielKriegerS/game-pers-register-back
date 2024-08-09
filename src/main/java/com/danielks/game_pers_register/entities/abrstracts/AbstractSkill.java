package com.danielks.game_pers_register.entities.abrstracts;

import java.util.Objects;
import java.util.UUID;

public abstract class AbstractSkill {
    protected UUID id;
    protected String name;
    protected int value;

    public AbstractSkill() {
    }

    public AbstractSkill(UUID id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
