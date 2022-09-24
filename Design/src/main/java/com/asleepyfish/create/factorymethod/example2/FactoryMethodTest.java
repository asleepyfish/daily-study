package com.asleepyfish.create.factorymethod.example2;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:10
 * @Description: TODO
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Factory xiaoMiFactory = new XiaoMiFactory();
        Phone miPhone = xiaoMiFactory.createPhone();
    }
}
