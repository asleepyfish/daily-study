package com.asleepyfish.create.abstractfactory.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/15 14:05
 * @Description: 工厂接口
 */
public interface Factory {
    Phone createPhone();

    PC createPc();
}

/**
 * 小米工厂，生产小米的产品
 */
class XiaoMiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public PC createPc() {
        return new MiPc();
    }
}

class AppleFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public PC createPc() {
        return new IMac();
    }
}
