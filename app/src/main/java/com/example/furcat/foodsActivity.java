package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class foodsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        Log.d("foodsActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("raiseActivity", "Adding FoodsFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new FoodsFragment())
                    .commit();
        }
    }
}