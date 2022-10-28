package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/28 16:24
 * @Description: TODO
 */
public class AppleFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public PC createPc() {
        return new IMac();
    }
}
