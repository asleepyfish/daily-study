package com.asleepyfish.create.singleton.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 13:25
 * @Description: 懒汉模式，多线程可以使用，双锁
 */
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2;

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        if (lazySingleton2 == null) {
            synchronized (LazySingleton2.class) {
                if (lazySingleton2 == null) {
                    lazySingleton2 = new LazySingleton2();
                }
            }
        }
        return lazySingleton2;
    }
}
