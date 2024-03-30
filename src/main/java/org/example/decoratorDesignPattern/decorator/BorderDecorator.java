package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.Shape;

public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border Color: Red");

    }
}
