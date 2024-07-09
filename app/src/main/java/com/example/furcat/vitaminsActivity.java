package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class vitaminsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamins);
        Log.d("vitaminsActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("vitaminsActivity", "Adding VitaminsFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new VitaminsFragment())
                    .commit();
        }
    }
}