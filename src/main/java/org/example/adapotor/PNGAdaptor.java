package org.example.adapotor;

import org.example.MediaPlayer;
import org.example.images.PNGMediaPlayer;

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
