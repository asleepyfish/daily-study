package com.asleepyfish.create.simplefactory.example2;

/**
 * @Author: asleepyfish
 * @Date: 2022/11/11 14:15
 * @Description: TODO
 */
public class FruitFactoryTest {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.produceFruit("orange");
        fruit.plant();
    }
}
