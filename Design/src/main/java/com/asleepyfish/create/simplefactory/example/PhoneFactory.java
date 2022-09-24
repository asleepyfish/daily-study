package com.asleepyfish.create.simplefactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/10 16:35
 * @Description: TODO
 */
public class PhoneFactory {
    public PhoneFactory() {
    }

    public Phone createPhone(String phoneName) {
        if ("MiPhone".equalsIgnoreCase(phoneName)) {
            return new MiPhone();
        }
        if ("IPhone".equalsIgnoreCase(phoneName)) {
            return new IPhone();
        }
        return null;
    }
}
