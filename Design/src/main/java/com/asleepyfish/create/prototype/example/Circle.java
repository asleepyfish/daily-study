package com.asleepyfish.create.prototype.example;

import java.util.Scanner;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:05
 * @description:
 */
public class Circle implements Shape {
    @Override
    public Circle clone() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆⚪失败");
        }
        return c;
    }

    @Override
    public void countArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入⚪的半径：");
        int r = sc.nextInt();
        System.out.println("⚪的面积是：" + Math.PI * r * r);
    }
}
