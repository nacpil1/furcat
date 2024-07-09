package com.example.furcat;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class raiseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise);
        Log.d("raiseActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("raiseActivity", "Adding RaiseFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new RaiseFragment())
                    .commit();
        }
    }
}
