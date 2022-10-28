package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:05
 * @Description: 工厂接口
 */
public interface Factory {
    Phone createPhone();

    PC createPc();
}

