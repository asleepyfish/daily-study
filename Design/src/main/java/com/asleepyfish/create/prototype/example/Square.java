package com.asleepyfish.create.prototype.example;

import java.util.Scanner;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:09
 * @description:
 */
public class Square implements Shape {
    @Override
    public Square clone() {
        Square s = null;
        try {
            s = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public void countArea() {
        System.out.println("请输入正方形的边长：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("正方形的面积是：" + a * a);
    }
}
