package com.example.furcat;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class raiseActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise1);
        Log.d("raiseActivity1", "Activity started");

        if (savedInstanceState == null) {
            Log.d("raiseActivity", "Adding RaiseFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new FragmentRaise1())
                    .commit();
        }
    }
}

