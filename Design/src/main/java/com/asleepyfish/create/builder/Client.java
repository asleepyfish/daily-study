package com.asleepyfish.create.builder;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:08
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
