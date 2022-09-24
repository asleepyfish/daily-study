package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:25
 * @Description: 电脑产品接口
 */
public interface PC {
    void make();
}

class MiPc implements PC {
    public MiPc() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米电脑...");
    }
}

class IMac implements PC {
    public IMac() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产imac...");
    }
}