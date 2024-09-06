package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Abouthelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abouthelp);
        Button button = findViewById(R.id.buttonSend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abouthelp.this, Mailus.class);
                startActivity(intent);
            }
        });
        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i= new Intent(Abouthelp.this, MainActivity7.class);
            startActivity(i);
        });
    }
}