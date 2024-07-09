package com.example.furcat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("NAME");
        String description = getIntent().getStringExtra("DESCRIPTION");
        int image = getIntent().getIntExtra("IMAGE", 0);

        TextView nameTextView = findViewById(R.id.AA_Title);
        TextView descriptionTextView = findViewById(R.id.AA_Description);
        ImageView AA_Image = findViewById(R.id.AA_Image);

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        AA_Image.setImageResource(image);
    }
}
