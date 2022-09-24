package com.asleepyfish.structural.decorator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/30 19:51
 * @Description: TODO
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println("===============");
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());
        redShapeDecorator.draw();
    }
}
