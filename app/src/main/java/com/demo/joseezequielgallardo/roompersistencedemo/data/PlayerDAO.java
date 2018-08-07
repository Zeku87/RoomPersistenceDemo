package com.demo.joseezequielgallardo.roompersistencedemo.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface PlayerDAO {

    @Query("SELECT * FROM player")
    List<Player> getAll();

    @Insert
    void insertAll(Player... players);
}
