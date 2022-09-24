package com.asleepyfish.create.simplefactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/10 16:04
 * @Description: 产品接口
 */
public interface Phone {
    void make();
}

class MiPhone implements Phone {
    public MiPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi Phone...");
    }
}

class IPhone implements Phone{
    public IPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("make IPhone...");
    }
}
