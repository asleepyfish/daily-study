package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:28
 * @Description: TODO
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory miFactory = new XiaoMiFactory();
        Factory appleFactory = new AppleFactory();
        Phone miPhone = miFactory.createPhone();
        PC miPc = miFactory.createPc();
        Phone iphone = appleFactory.createPhone();
        PC iMac = appleFactory.createPc();
    }
}
