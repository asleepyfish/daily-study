package com.asleepyfish.create.singleton.example;

/**
 * @author: zhoujh
 * @date: 2021/12/3 14:21
 * @description: 饿汉模式，可以直接用于多线程，不会出问题
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
