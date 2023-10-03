package com.example.formulairesae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);
        tv.setText(getIntent().getStringExtra("nom")+ " "+getIntent().getStringExtra("prenom")
        + " "+getIntent().getStringExtra("Hobbies")
                        + " "+ getIntent().getStringExtra("Genre")

        );
    }
}