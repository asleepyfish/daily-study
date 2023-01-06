package com.asleepyfish.create.factorymethod.example3;

/**
 * @Author: asleepyfish
 * @Date: 2022/11/16 17:38
 * @Description: TODO
 */
public class AnhuiFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new Peach();
    }
}
