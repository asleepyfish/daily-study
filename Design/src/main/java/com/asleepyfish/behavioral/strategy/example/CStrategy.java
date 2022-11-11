package com.asleepyfish.behavioral.strategy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:43
 * @Description: TODO
 */
public class CStrategy implements Strategy {
    @Override
    public double calPrice(double dealPrice, double dealQuantity) {
        return dealPrice * dealQuantity;
    }
}
