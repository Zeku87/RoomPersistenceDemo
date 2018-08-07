package com.demo.joseezequielgallardo.roompersistencedemo.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Player {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int playerId;

    private String name;

    private String team;

    public Player(){}


    @NonNull
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(@NonNull int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}
