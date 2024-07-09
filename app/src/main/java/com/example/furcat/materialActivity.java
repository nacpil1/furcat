package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class materialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        Log.d("materialActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("materialActivity", "Adding MaterialFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new MaterialFragment())
                    .commit();
        }
    }
}