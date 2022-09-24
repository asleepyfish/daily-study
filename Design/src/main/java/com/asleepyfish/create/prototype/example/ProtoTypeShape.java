package com.asleepyfish.create.prototype.example;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:18
 * @description:
 */
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager manager = new ProtoTypeManager();
        Shape circle = manager.getShape("Circle");
        circle.countArea();
        Shape square = manager.getShape("Square");
        square.countArea();
    }
}
