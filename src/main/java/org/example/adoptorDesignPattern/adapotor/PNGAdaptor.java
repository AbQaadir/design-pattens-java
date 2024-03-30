package org.example.adoptorDesignPattern.adapotor;

import org.example.adoptorDesignPattern.MediaPlayer;
import org.example.adoptorDesignPattern.images.PNGMediaPlayer;

public class PNGAdaptor implements MediaPlayer {
    private final PNGMediaPlayer pngMediaPlayer;

    public PNGAdaptor(PNGMediaPlayer pngMediaPlayer) {
        this.pngMediaPlayer = pngMediaPlayer;
    }

    @Override
    public void play(String filePath) {
        pngMediaPlayer.view(filePath);
    }
}
