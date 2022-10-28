package com.asleepyfish.create.factorymethod.example2;

/**
 * 小米工厂，生产小米的产品
 */
public class XiaoMiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
