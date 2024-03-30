package org.example.adoptorDesignPattern.adapotor;

import org.example.adoptorDesignPattern.MediaPlayer;
import org.example.adoptorDesignPattern.images.JPGMediaPlayer;

public class JPGAdaptor implements MediaPlayer {
    private final JPGMediaPlayer jpgMediaPlayer;

    public JPGAdaptor(JPGMediaPlayer jpgMediaPlayer) {
        this.jpgMediaPlayer = jpgMediaPlayer;
    }

    @Override
    public void play(String filePath) {
        jpgMediaPlayer.view(filePath);
    }
}
