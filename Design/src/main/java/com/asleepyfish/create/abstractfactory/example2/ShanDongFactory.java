package com.asleepyfish.create.abstractfactory.example2;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/17 10:31
 * @Description: TODO
 */
public class ShanDongFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public Animal createAnimal() {
        return new Sheep();
    }
}
