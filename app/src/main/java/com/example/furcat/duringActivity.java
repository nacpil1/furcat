package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class duringActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_during);
        Log.d("duringsActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("duringActivity", "Adding DuringFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new DuringFragment())
                    .commit();
        }
    }
}