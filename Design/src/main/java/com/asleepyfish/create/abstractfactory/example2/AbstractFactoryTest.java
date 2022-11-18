package com.asleepyfish.create.abstractfactory.example2;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/17 10:31
 * @Description: TODO
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = new ShangHaiFactory();
        factory.createFruit().plant();
        factory.createAnimal().breed();
    }
}
