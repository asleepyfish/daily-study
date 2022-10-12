package com.asleepyfish.structural.proxy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/26 10:44
 * @Description: 房东类，租房子给租客
 */
public class LandLord implements Rent {
    @Override
    public void rent(String name) {
        System.out.println("出租房子给" + name);
    }
}
