package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.Shape;

abstract public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
