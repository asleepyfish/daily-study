package com.asleepyfish.create.builder;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:07
 * @description:
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}
