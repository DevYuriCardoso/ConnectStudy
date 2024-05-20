package com.academy.studyconnect;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlayerAudioBookHistoria extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private SeekBar seekVolume;
    private AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_audio_book_historia);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tokiohotel);



    }

    private void inicializarSeekBar(){
        seekVolume = findViewById(R.id.seekVolume);

        //configurar audio (Volume maximo do celular do usuário e volume atual do mesmo

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //recupera valores
        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        //Configurar volume Maximo SeekBar

        seekVolume.setMax(volumeMaximo);
        //configurar o progresso atual da SeekBar

        seekVolume.setProgress(volumeAtual);

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, audioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }

    public void executarSom(View view){
        if (mediaPlayer != null) {
            mediaPlayer.start();
        };
    }

    public void pausarSom(View view){
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    public void pararSom(View view){
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tokiohotel);
        };
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


    /*
    //Fechar a o audiobook quando fechar o app, no caso a musica pararia, deixei aqui como extra, para no futuro add no menu de consigurações
    //a maioria dos usuários não vão querer que quando minimize o app ele pare de tocar, então deixei essa opção restrita provisoriamente.
    public void  onStop(){
        super.onStop();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }
    */

}