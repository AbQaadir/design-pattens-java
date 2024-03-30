package org.example;

public class MP3MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filePath) {
        System.out.println("Playing MP3 file " + filePath);
    }
}
