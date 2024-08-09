package com.danielks.game_pers_register.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Equipments {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "equipment_type_id")
    private EquipType type;
    private int equipmentValue;
    private int level;

    public Equipments() {
    }

    public Equipments(UUID id, String name, EquipType type, int equipmentValue, int level) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.equipmentValue = equipmentValue;
        this.level = level;
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

    public EquipType getType() {
        return type;
    }

    public void setType(EquipType type) {
        this.type = type;
    }

    public int getEquipmentValue() {
        return equipmentValue;
    }

    public void setEquipmentValue(int equipmentValue) {
        this.equipmentValue = equipmentValue;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipments that = (Equipments) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
