package com.asleepyfish.create.abstractfactory.example2;

/**
 * @Author: asleepyfish
 * @Date: 2022/11/17 10:30
 * @Description: TODO
 */
public class ShangHaiFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Animal createAnimal() {
        return new Cow();
    }
}
