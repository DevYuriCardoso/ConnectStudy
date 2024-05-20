package com.academy.studyconnect.comunicacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.academy.studyconnect.R;

public class PlayerComunicacao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_comunicacao);

    }

    public void abrirVideo(View view) {
        startActivity(new Intent(this, PlayerActivity.class));

    }
}
