package com.asleepyfish.structural.adapter.example.objectadapter;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/19 10:34
 * @Description: TODO
 */
public class PowerAdapter implements DC5 {
    private final AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        return ac220 == null ? 0 : ac220.output220V() / 44;
    }
}
