package com.academy.studyconnect.comunicacao;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.academy.studyconnect.R;

public class PlayerActivity extends AppCompatActivity {

    protected VideoView videoView;
    protected MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar a barra de status e a barra de navegação
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_video_view);

        videoView = findViewById(R.id.activity_my_video);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Reproduzir um vídeo específico
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        Toast.makeText(this, "Inicio do Video", Toast.LENGTH_SHORT).show();
        videoView.setMediaController(mediaController);
    }
}