package com.asleepyfish.structural.decorator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/30 19:23
 * @Description: 装饰器模式和桥接模式的区别就是，装饰器模式的抽象类B（ShapeDecorator）需要实现A（Shape）,所以B是A的一部分
 * 而桥接模式抽象类B只是拥有A，两者之间是组合拥有的关系
 * 两种模式都有变量A的对象
 * <p>
 * TODO:个人觉得桥接模式更好一些，可以避免继承，降低耦合
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

