package com.asleepyfish.create.singleton;

import com.asleepyfish.create.singleton.example.HungrySingleton;
import com.asleepyfish.create.singleton.example.LazySingleton;
import com.asleepyfish.create.singleton.example.LazySingleton2;
import com.asleepyfish.create.singleton.example.LazySingletonHolder;

/**
 * @author: zhoujh
 * @date: 2021/12/3 14:25
 * @description:
 */
public class SingletonTest {
    public static void main(String[] args) {
        LazySingleton firstInstance = LazySingleton.getInstance();
        LazySingleton secondInstance = LazySingleton.getInstance();
        System.out.println(firstInstance == secondInstance);
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton2 lazySingleton2 = LazySingleton2.getInstance();
        LazySingletonHolder lazySingletonHolder = LazySingletonHolder.getInstance();
    }
    public void test() {
        System.out.println("test........");
    }
}
