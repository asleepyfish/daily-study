package com.asleepyfish.structural.bridge.example;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/16 17:25
 * @Description: TODO
 */
public class BridgeTest {
    public static void main(String[] args) {
        Color red = new Red();
        // 红色的圆
        Shape circle = new Circle(red);
        circle.draw();

        Color blue = new Blue();
        // 蓝色长方形
        Shape rectangle = new Rectangle(blue);
        rectangle.draw();
    }
}
