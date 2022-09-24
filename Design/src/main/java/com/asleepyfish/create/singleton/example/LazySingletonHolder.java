package com.asleepyfish.create.singleton.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 13:31
 * @Description: 登记式/静态内部类
 */
public class LazySingletonHolder {
    private static class LazySingletonHold {
        private static final LazySingletonHolder LAZY_SINGLETON_HOLDER = new LazySingletonHolder();
    }

    private LazySingletonHolder() {
    }

    public static LazySingletonHolder getInstance() {
        return LazySingletonHold.LAZY_SINGLETON_HOLDER;
    }
}
