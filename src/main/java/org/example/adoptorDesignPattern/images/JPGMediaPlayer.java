package org.example.adoptorDesignPattern.images;

public class JPGMediaPlayer implements ImageViewer {

    @Override
    public void view(String filePath) {
        System.out.println("Displaying JPG file " + filePath);
    }
}
