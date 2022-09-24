package com.asleepyfish.behavioral.strategy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/11 13:11
 * @Description: 上下文类
 */
public class Context {
    private final Strategy strategy;

    /**
     * 传入一个接口作为参数，可以指定多种的策略（实现策略接口即可）
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calPrice(double dealPrice, double dealQuantity) {
        return strategy.calPrice(dealPrice, dealQuantity);
    }
}
