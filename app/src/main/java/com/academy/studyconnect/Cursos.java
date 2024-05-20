package com.academy.studyconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.academy.studyconnect.comunicacao.ComunucacaoCursos;

public class Cursos extends AppCompatActivity {

    private ImageView btnComunicacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        btnComunicacao = findViewById(R.id.btn_comunicacao_Curso);
        btnComunicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ComunucacaoCursos.class);
                startActivity(intent);
            }
        });
    }
}