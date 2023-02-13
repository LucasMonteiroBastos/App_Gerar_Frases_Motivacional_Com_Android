package com.example.myapplication;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;

    private Button gerarFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frases = findViewById(R.id.frases);

        gerarFrase = findViewById(R.id.gerarFrases);

        gerarFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] fraseMotivacionais = {"aaaaa", "bbbbb", "cccccc"};


                Random random = new Random();
                int numeroRandom = random.nextInt(fraseMotivacionais.length);

                frases.setText(fraseMotivacionais[numeroRandom]);
            }
        });
    }
}