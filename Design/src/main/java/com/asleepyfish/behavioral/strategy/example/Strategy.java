package com.asleepyfish.behavioral.strategy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/11 9:50
 * @Description: 计费策略，不同类型顾客费用不同
 */
public interface Strategy {
    double calPrice(double dealPrice, double dealQuantity);
}

class AStrategy implements Strategy {
    @Override
    public double calPrice(double dealPrice, double dealQuantity) {
        return dealPrice * dealQuantity * 0.8;
    }
}

class BStrategy implements Strategy {
    @Override
    public double calPrice(double dealPrice, double dealQuantity) {
        return dealPrice * dealQuantity * 0.9;
    }
}

class CStrategy implements Strategy {
    @Override
    public double calPrice(double dealPrice, double dealQuantity) {
        return dealPrice * dealQuantity;
    }
}