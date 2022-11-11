package com.asleepyfish.structural.decorator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 16:10
 * @Description: TODO
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedColor();
    }

    private void setRedColor() {
        System.out.println("Color : Red");
    }
}
