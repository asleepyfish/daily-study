package com.asleepyfish.create.factorymethod.example2;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/28 16:12
 * @Description: TODO
 */
public class AppleFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
