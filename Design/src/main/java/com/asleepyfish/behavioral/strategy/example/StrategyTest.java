package com.asleepyfish.behavioral.strategy.example;

import java.util.Scanner;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/11 13:28
 * @Description: TODO
 */
public class StrategyTest {
    public static void main(String[] args) {
        BStrategy bStrategy = new BStrategy();
        Context context = new Context(bStrategy);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入单价：");
        double dealPrice = sc.nextDouble();
        System.out.println("请输入数量：");
        double dealQuantity = sc.nextDouble();
        System.out.println("优惠后总价：" + context.calPrice(dealPrice, dealQuantity));
    }
}
