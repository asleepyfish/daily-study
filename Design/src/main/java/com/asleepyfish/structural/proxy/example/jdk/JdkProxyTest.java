package com.asleepyfish.structural.proxy.example.jdk;

import com.asleepyfish.structural.proxy.example.LandLord;
import com.asleepyfish.structural.proxy.example.Rent;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/26 10:59
 * @Description: JDK代理测试
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        Rent rent  = new LandLord();
        Object proxy = new JdkRentProxy().getProxy(rent);
        if (proxy instanceof Rent) {
            ((Rent) proxy).rent("张三");
        }
    }
}
