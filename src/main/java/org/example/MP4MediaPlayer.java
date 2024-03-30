package org.example;

public class MP4MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filePath) {
        System.out.println("Playing MP4 file " + filePath);
    }
}
