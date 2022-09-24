package com.asleepyfish.create.builder.example;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:16
 * @description:
 */
//具体建造者：具体装修工人2
class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        product.setWall("w2");
    }

    @Override
    public void buildTV() {
        product.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
