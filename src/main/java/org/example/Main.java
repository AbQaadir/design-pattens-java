package org.example;

import org.example.adoptorDesignPattern.MediaPlayer;
import org.example.adoptorDesignPattern.MediaPlayerFactory;
import org.example.observerDesignPattern.Observer;
import org.example.observerDesignPattern.Subject;
import org.example.observerDesignPattern.Type1Observer;
import org.example.observerDesignPattern.Type2Observer;

public class Main {
    public static void main(String[] args) {
//        String filePath = "sample.jpg";
//
//        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
//        MediaPlayer mediaPlayer = mediaPlayerFactory.createMediaPlayer(filePath);
//
//        if (mediaPlayer != null) {
//            mediaPlayer.play(filePath);
//        } else {
//            System.out.println("Unsupported media type");
//        }

        Observer type1Observer = new Type1Observer();
        Observer type2Observer = new Type2Observer();

        Subject subject = new Subject();

        subject.registerObserver(type1Observer);
        subject.registerObserver(type2Observer);

        subject.notifyObservers("Hello World!");

        subject.removeObserver(type1Observer);

        subject.notifyObservers("Hello World Again!");



    }
}