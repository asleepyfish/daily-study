package com.asleepyfish.create.factorymethod.example3;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/16 17:38
 * @Description: TODO
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory ahFactory = new AnhuiFactory();
        Fruit fruit = ahFactory.createFruit();
        fruit.plant();
        System.out.println("================");

        Factory zjFactory = new ZheJiangFactory();
        Fruit fruit1 = zjFactory.createFruit();
        fruit1.plant();
    }
}
