package com.example.lebac.services;

import android.content.Context;
import android.media.MediaPlayer;

public class MusicPlayer {

    public static MusicPlayer instance;

    private MediaPlayer mediaPlayer;

    private MusicPlayer() {
    }

    public void play(Context context, int id, int id2) {
        if (mediaPlayer != null) {
            this.mediaPlayer.stop();
        }


        this.mediaPlayer = MediaPlayer.create(context, pickResource(id, id2));
        this.mediaPlayer.start();
    }

    public void stop() {
        this.mediaPlayer.stop();
    }

    public void resume(){
        this.mediaPlayer.start();
    }

    private int pickResource(int id, int id2) {
        final Integer random = random();

        if (random.equals(5)) {
            return id;
        }

        return id2;
    }

    private Integer random() {
        return (int) Math.floor(Math.random() * (5 + 1));
    }

    public static MusicPlayer getInstance() {
        if (instance != null) {
            return instance;
        }

        return instance = new MusicPlayer();
    }
}
