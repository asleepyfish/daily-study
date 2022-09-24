package com.asleepyfish.structural.bridge.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/16 15:37
 * @Description: 颜色接口
 */
public interface Color {
    void paint();
}

class Red implements Color {

    @Override
    public void paint() {
        System.out.println("画上红色");
    }
}

class Blue implements Color {

    @Override
    public void paint() {
        System.out.println("画上蓝色");
    }
}
