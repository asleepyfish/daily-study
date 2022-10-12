package com.asleepyfish.structural.proxy.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/26 14:14
 * @Description: TODO
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        Rent rent = new LandLord();
        Object proxy = new CglibRentProxy().getProxy(rent);
        if (proxy instanceof Rent) {
            ((Rent) proxy).rent("李四");
        }
    }
}
