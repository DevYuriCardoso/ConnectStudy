package com.academy.studyconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HumanasAudioBook extends AppCompatActivity {

    private ImageView btn_historiaP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanas_audio_book);

        btn_historiaP = findViewById(R.id.btn_historia);
        btn_historiaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AudioBookHistoria.class);
                startActivity(intent);
            }
        });


    }




}