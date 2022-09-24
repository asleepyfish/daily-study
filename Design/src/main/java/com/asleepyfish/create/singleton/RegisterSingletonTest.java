package com.asleepyfish.create.singleton;

import com.asleepyfish.create.singleton.example.RegisterSingleton;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/10 9:36
 * @Description: TODO
 */
public class RegisterSingletonTest {
    public static void main(String[] args) {
        if (RegisterSingleton.getInstance(null) instanceof RegisterSingleton) {
            System.out.println(true);
        }
        Object instance = RegisterSingleton.getInstance("com.learn.create.singleton.SingletonTest");
        if (instance instanceof SingletonTest) {
            ((SingletonTest) instance).test();
        }
    }
}
