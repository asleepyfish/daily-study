package com.asleepyfish.create.simplefactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/10 16:37
 * @Description: TODO
 */
public class PhoneTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iphone = phoneFactory.createPhone("iphone");
    }
}
