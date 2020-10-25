package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imagekepTe, imagekepGep;
    private TextView ember, gep;
    private Button btnKo, btnPapir, btnOllo;
    private String gepValasztas, emberValasztas;
    private int gepSzamol,emberSzamol,dontetlenSzamol;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rnd = new Random();
        init();



        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emberValasztas = "Kő";
                imagekepTe.setImageResource(R.drawable.rock);
                Jatek();
            }
        });

        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emberValasztas = "Papir";
                imagekepTe.setImageResource(R.drawable.paper);
                Jatek();
            }
        });

        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emberValasztas = "Olló";
                imagekepTe.setImageResource(R.drawable.scissors);
                Jatek();
            }
        });
    }

    public void Jatek(){
    int gep = rnd.nextInt(3);

    if (gep == 0){
        gepValasztas = "Kő";
        imagekepGep.setImageResource(R.drawable.rock);
    }else if (gep == 1){
        gepValasztas = "Papir";
        imagekepGep.setImageResource(R.drawable.paper);
    }else if (gep == 2){
        gepValasztas = "Olló";
        imagekepGep.setImageResource(R.drawable.scissors);
    }

    if (emberValasztas.equals("Kő") && gepValasztas.equals("Papir")){
        Toast.makeText(MainActivity.this, "Ön vesztett, a gép nyert", Toast.LENGTH_SHORT).show();
        gep++;
    }else
    if (emberValasztas.equals("Kő") && gepValasztas.equals("Olló")){
            Toast.makeText(MainActivity.this, "Ön nyert, a gép vesztett", Toast.LENGTH_SHORT).show();
            emberSzamol++;
        }else
    if (emberValasztas.equals("Papir") && gepValasztas.equals("Kő")){
            Toast.makeText(MainActivity.this, "Ön nyert, a gép vesztett", Toast.LENGTH_SHORT).show();
            emberSzamol++;
        }else
    if (emberValasztas.equals("Papir") && gepValasztas.equals("Olló")){
            Toast.makeText(MainActivity.this, "Ön vesztett, a gép nyert", Toast.LENGTH_SHORT).show();
            gepSzamol++;
        }else
    if (emberValasztas.equals("Olló") && gepValasztas.equals("Papir")){
            Toast.makeText(MainActivity.this, "Ön nyert, a gép vesztett", Toast.LENGTH_SHORT).show();
            emberSzamol++;
        }else
    if (emberValasztas.equals("Olló") && gepValasztas.equals("Kő")){
            Toast.makeText(MainActivity.this, "Ön vesztett, a gép nyert", Toast.LENGTH_SHORT).show();
            gepSzamol++;
        }else
    if (emberValasztas.equals("Olló") && gepValasztas.equals("Olló")){
            Toast.makeText(MainActivity.this, "Ez döntetlen", Toast.LENGTH_SHORT).show();
            dontetlenSzamol++;
        }else
    if (emberValasztas.equals("Kő") && gepValasztas.equals("Kő")){
            Toast.makeText(MainActivity.this, "Ez döntetlen", Toast.LENGTH_SHORT).show();
            dontetlenSzamol++;
        }else
    if (emberValasztas.equals("Papir") && gepValasztas.equals("Papir")){
            Toast.makeText(MainActivity.this, "Ez döntetlen", Toast.LENGTH_SHORT).show();
            dontetlenSzamol++;
        }

    }


    private void init() {

        imagekepGep = findViewById(R.id.image_kepGep);
        imagekepTe = findViewById(R.id.image_kepTe);
        btnKo = findViewById(R.id.btn_Ko);
        btnPapir = findViewById(R.id.btn_Papir);
        btnOllo = findViewById(R.id.btn_Ollo);
        ember = findViewById(R.id.ember);
        gep = findViewById(R.id.gep);

    }


}