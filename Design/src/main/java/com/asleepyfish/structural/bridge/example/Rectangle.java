package com.asleepyfish.structural.bridge.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 15:21
 * @Description: TODO
 */
public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("我是长方形");
        color.paint();
    }
}
