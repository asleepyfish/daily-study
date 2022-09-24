package com.asleepyfish.create.builder.example;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:16
 * @description:
 */
//具体建造者：具体装修工人1
class ConcreteDecorator1 extends Decorator {
    @Override
    public void buildWall() {
        product.setWall("w1");
    }

    @Override
    public void buildTV() {
        product.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
