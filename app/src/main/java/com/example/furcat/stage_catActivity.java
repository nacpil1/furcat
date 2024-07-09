package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class stage_catActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise1);
        Log.d("stage_catActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("stage_catActivity", "Adding Stage_catFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new Stage_catFragment())
                    .commit();
        }
    }
}