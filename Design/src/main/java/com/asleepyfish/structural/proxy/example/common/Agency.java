package com.asleepyfish.structural.proxy.example.common;

import com.asleepyfish.structural.proxy.example.Rent;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/24 11:53
 * @Description: 房屋中介
 */
public class Agency implements Rent {
    private Rent rent;

    public Agency(Rent rent) {
        this.rent = rent;
    }

    @Override
    public void rent(String name) {
        System.out.println("中介带租客看房");
        rent.rent(name);
        System.out.println("中介出租房子成功！");
    }
}
