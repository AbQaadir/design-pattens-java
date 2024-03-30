package org.example.observerDesignPattern;

public class Type2Observer implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Type2Observer: " + message);
    }
}
