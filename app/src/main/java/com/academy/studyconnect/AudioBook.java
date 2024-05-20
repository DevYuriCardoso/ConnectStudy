package com.academy.studyconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AudioBook extends AppCompatActivity {


    private ImageView btn_HumanasBookCLick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_book);

        btn_HumanasBookCLick = findViewById(R.id.btn_Photoshop);
        btn_HumanasBookCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HumanasAudioBook.class);
                startActivity(intent);
            }
        });
    }
}