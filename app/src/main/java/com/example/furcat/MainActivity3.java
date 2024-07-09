package com.example.furcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String name = getIntent().getStringExtra("NAME");
        String description = getIntent().getStringExtra("DESCRIPTION");


        TextView nameTextView = findViewById(R.id.BB_Title);
        TextView descriptionTextView = findViewById(R.id.BB_Description);


        nameTextView.setText(name);
        descriptionTextView.setText(description);

    }
}