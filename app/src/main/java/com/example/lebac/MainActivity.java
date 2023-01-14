package com.example.lebac;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lebac.services.MusicPlayer;

public class MainActivity extends AppCompatActivity {

    private final MusicPlayer player;

    public MainActivity() {
        this.player = MusicPlayer.getInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button)
                .setOnClickListener(view -> this.player.play(this, R.raw.lebac, R.raw.angerfist));
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}