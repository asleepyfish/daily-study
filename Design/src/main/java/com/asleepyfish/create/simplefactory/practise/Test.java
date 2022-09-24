package com.asleepyfish.create.simplefactory.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 17:30
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Product product = Factory.makeProduct("B");
        product.show();
    }

    interface Product {
        void show();
    }

    static class ProductA implements Product {
        @Override
        public void show() {
            System.out.println("make A");
        }
    }

    static class ProductB implements Product {
        @Override
        public void show() {
            System.out.println("make B");
        }
    }

    static class Factory {
        public static Product makeProduct(String name) {
            switch (name) {
                case "A":
                    return new ProductA();
                case "B":
                    return new ProductB();
            }
            return null;
        }
    }


}
