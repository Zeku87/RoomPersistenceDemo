package com.demo.joseezequielgallardo.roompersistencedemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.joseezequielgallardo.roompersistencedemo.data.AppDatabase;
import com.demo.joseezequielgallardo.roompersistencedemo.databinding.ActivityMainBinding;
import com.demo.joseezequielgallardo.roompersistencedemo.utils.DatabaseInitializer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.addButton.setOnClickListener( view -> DatabaseInitializer.populateAsync(
                AppDatabase.getAppDatabase(this)
        ));


    }
}
