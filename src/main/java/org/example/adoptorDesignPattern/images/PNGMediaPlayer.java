package org.example.adoptorDesignPattern.images;

public class PNGMediaPlayer implements ImageViewer {
    @Override
    public void view(String filePath) {
        System.out.println("Displaying PNG file " + filePath);
    }
}
