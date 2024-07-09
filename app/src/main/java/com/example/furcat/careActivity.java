package com.example.furcat;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class careActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregcare);
        Log.d("careActivity", "Activity started");


        if (savedInstanceState == null) {
            Log.d("careActivity", "Activity started");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_care, new pregnancyFragment())
                    .commit();
        }
    }
}