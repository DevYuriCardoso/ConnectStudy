package com.academy.studyconnect.comunicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.academy.studyconnect.HumanasAudioBook;
import com.academy.studyconnect.R;


public class ComunucacaoCursos extends AppCompatActivity {


    private ImageView btn_Photoshop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunucacao_cursos);

        btn_Photoshop = findViewById(R.id.btn_Photoshop);
        btn_Photoshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlayerComunicacao.class);
                startActivity(intent);
            }
        });
    }
}