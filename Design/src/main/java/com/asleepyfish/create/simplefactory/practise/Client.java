package com.asleepyfish.create.simplefactory.practise;

import java.util.Scanner;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:26
 * @description: 在简单工厂模式中创建实例的方法通常为静态（static）方法，因此简单工厂模式（Simple Factory Pattern）
 * 又叫作静态工厂方法模式（Static Factory Method Pattern）。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("请输入产品编号：");
        int i = new Scanner(System.in).nextInt();
        Product product = SimpleFactory.makeProduct(i);
        product.show();
    }

    //抽象产品
    public interface Product {
        void show();
    }

    //具体产品：ProductA
    static class ConcreteProduct1 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    //具体产品：ProductB
    static class ConcreteProduct2 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    static final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
                default:
                    return null;
            }
        }
    }
}
