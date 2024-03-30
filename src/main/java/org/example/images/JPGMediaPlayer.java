package org.example.images;

import org.example.MediaPlayer;

public class JPGMediaPlayer implements ImageViewer {

    @Override
    public void view(String filePath) {
        System.out.println("Displaying JPG file " + filePath);
    }
}
