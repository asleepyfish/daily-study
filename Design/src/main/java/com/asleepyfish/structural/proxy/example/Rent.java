package com.asleepyfish.structural.proxy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/24 16:28
 * @Description: 房东接口，这里可以让中介来帮房东出租房子，使用代理模式模拟中介行为
 */
public interface Rent {
    /**
     * 租房子给哪个租户
     *
     * @param name 名字
     */
    void rent(String name);
}
