package com.danielks.game_pers_register.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pers> pers;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NPCs> npcs;
    private boolean ended;
    private String result;

    public Game() {
    }

    public Game(UUID id, String title, Date date, List<Pers> pers, List<NPCs> npcs, boolean ended, String result) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.pers = pers;
        this.npcs = npcs;
        this.ended = ended;
        this.result = result;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Pers> getPers() {
        return pers;
    }

    public void setPers(List<Pers> pers) {
        this.pers = pers;
    }

    public List<NPCs> getNpcs() {
        return npcs;
    }

    public void setNpcs(List<NPCs> npcs) {
        this.npcs = npcs;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id.equals(game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
