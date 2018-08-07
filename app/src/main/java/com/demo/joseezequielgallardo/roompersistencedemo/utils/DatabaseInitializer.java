package com.demo.joseezequielgallardo.roompersistencedemo.utils;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.demo.joseezequielgallardo.roompersistencedemo.data.AppDatabase;
import com.demo.joseezequielgallardo.roompersistencedemo.data.Player;

import java.util.List;

public class DatabaseInitializer {

    public static void populateAsync(@NonNull final AppDatabase database){
        PopulateDbAsync task = new PopulateDbAsync(database);
        task.execute();
    }

    public static void populateSync(@NonNull final AppDatabase database){
        populateWithTestData(database);
    }


    private static Player addPlayer(final AppDatabase database, Player player){
        database.playerDAO().insertAll(player);
        return player;
    }


    private static void populateWithTestData(AppDatabase database){
        Player player = new Player();
        player.setName("Cristiano");
        player.setTeam("Juventus");

        addPlayer(database, player);
        List<Player> playerList = database.playerDAO().getAll();
        Log.d("ROWS", "Count: " + playerList.size() );

    }


    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void>{

        private final AppDatabase mDatabase;

        PopulateDbAsync(AppDatabase database){
            mDatabase = database;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            populateWithTestData(mDatabase);
            return null;
        }
    }
}
