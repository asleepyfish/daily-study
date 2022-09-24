package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:00
 * @Description: 手机产品接口
 */
public interface Phone {
    void make();
}

class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米手机...");
    }
}

class IPhone implements Phone {
    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产iphone...");
    }
}
