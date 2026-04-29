package com.example.aurora.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aurora.R;

public class DetailActivity extends AppCompatActivity {

    TextView name, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.textName);
        description = findViewById(R.id.textDescription);

        String n = getIntent().getStringExtra("name");
        String d = getIntent().getStringExtra("description");

        name.setText(n);
        description.setText(d);
    }
}