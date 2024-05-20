package com.academy.studyconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {

    private ImageView btn_BookPlay;
    private ImageView btn_Cursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn_BookPlay = findViewById(R.id.btnBook);
        btn_Cursos = findViewById(R.id.btnCursos);

        btn_Cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cursos.class);
                startActivity(intent);
            }
        });
        btn_BookPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AudioBook.class);
                startActivity(intent);
            }
        });


    }
}