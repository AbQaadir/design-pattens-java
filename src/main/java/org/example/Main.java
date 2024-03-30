package org.example;

public class Main {
    public static void main(String[] args) {
        String filePath = "sample.jpg";

        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
        MediaPlayer mediaPlayer = mediaPlayerFactory.createMediaPlayer(filePath);

        if (mediaPlayer != null) {
            mediaPlayer.play(filePath);
        } else {
            System.out.println("Unsupported media type");
        }
    }
}