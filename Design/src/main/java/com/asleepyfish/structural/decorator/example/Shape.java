package com.asleepyfish.structural.decorator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/30 19:21
 * @Description: 形状接口
 */
public interface Shape {
    void draw();
}

/**
 * 创建实现接口的实体类
 */
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}


