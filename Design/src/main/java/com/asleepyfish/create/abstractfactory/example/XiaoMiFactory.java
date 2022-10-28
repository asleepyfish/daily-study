package com.asleepyfish.create.abstractfactory.example;

/**
 * 小米工厂，生产小米的产品
 */
public class XiaoMiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public PC createPc() {
        return new MiPc();
    }
}
