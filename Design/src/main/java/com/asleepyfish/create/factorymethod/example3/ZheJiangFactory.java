package com.asleepyfish.create.factorymethod.example3;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/16 17:38
 * @Description: TODO
 */
public class ZheJiangFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new Grape();
    }

}
