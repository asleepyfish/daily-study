package com.asleepyfish.create.builder.example;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:15
 * @description:
 */
//抽象建造者：装修工人
abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();

    public abstract void buildWall();

    public abstract void buildTV();

    public abstract void buildSofa();

    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
