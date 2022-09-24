package com.asleepyfish.create.singleton.example;

/**
 * @author: zhoujh
 * @date: 2021/12/3 14:18
 * @description: 懒汉模式，多线程需要加关键字，比较重
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
