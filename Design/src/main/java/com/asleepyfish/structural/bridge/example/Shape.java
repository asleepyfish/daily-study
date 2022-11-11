package com.asleepyfish.structural.bridge.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/16 15:39
 * @Description: 抽象形状类
 * 组合模式:强调部分与整体的组合 桥接模式:强调平行类之间的组合
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

