package com.asleepyfish.behavioral.strategy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/11 9:50
 * @Description: 计费策略，不同类型顾客费用不同
 */
public interface Strategy {
    double calPrice(double dealPrice, double dealQuantity);
}

