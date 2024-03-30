package org.example.adapotor;

import org.example.MediaPlayer;
import org.example.images.JPGMediaPlayer;

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
