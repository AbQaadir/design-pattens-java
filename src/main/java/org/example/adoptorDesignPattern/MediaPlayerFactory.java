package org.example.adoptorDesignPattern;

import org.example.adoptorDesignPattern.adapotor.JPGAdaptor;
import org.example.adoptorDesignPattern.adapotor.PNGAdaptor;
import org.example.adoptorDesignPattern.images.JPGMediaPlayer;
import org.example.adoptorDesignPattern.images.PNGMediaPlayer;

public class MediaPlayerFactory {
    public MediaPlayer createMediaPlayer(String filePath) {
        MediaPlayer mediaPlayer = null;

        if (filePath.endsWith(".mp4")) {
            mediaPlayer = new MP4MediaPlayer();
        } else if (filePath.endsWith(".mp3")) {
            mediaPlayer = new MP3MediaPlayer();
        } else if (filePath.endsWith(".jpg")) {
            mediaPlayer = new JPGAdaptor(new JPGMediaPlayer());
        } else if (filePath.endsWith(".png")) {
            mediaPlayer = new PNGAdaptor(new PNGMediaPlayer());
        }

        return mediaPlayer;
    }

}
