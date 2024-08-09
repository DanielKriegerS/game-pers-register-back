package com.danielks.game_pers_register.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Pers {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private int level;

    @ManyToOne
    @JoinColumn(name = "pers_type_id")
    private PersType type;
    private int charisma;

    @ManyToMany
    @JoinTable(
            name = "pers_equipments",
            joinColumns = @JoinColumn(name = "pers_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id")
    )
    private List <Equipments> equipments;

    public Pers() {
    }

    public Pers(UUID id, String name, int level, PersType type, int charisma, List<Equipments> equipments) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.type = type;
        this.charisma = charisma;
        this.equipments = equipments;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PersType getType() {
        return type;
    }

    public void setType(PersType type) {
        this.type = type;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public List<Equipments> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipments> equipments) {
        this.equipments = equipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pers pers = (Pers) o;
        return id.equals(pers.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
