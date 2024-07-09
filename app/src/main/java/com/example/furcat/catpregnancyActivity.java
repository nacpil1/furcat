package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class catpregnancyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catpregnancy);
        Log.d("catpregnancyActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("catpregnancyActivity", "Adding CatpregnancyFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new CatpregnancyFragment())
                    .commit();
        }
    }
}