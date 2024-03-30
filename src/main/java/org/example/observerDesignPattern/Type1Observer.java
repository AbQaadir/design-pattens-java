package org.example.observerDesignPattern;

public class Type1Observer implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Type1Observer: " + message);
    }
}
