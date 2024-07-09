package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class inheatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheat);
        Log.d("inheatActivity", "Activity started");

        if (savedInstanceState == null) {
            Log.d("inheatActivity", "Adding InheatFragment");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new InheatFragment())
                    .commit();
        }
    }
}