package com.asleepyfish.structural.proxy.example.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/26 10:53
 * @Description: JDK代理，模拟中介出租
 */
public class JdkRentProxy implements InvocationHandler {
    private Object object;

    public Object getProxy(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介带租客看房");
        Object invoke = method.invoke(object, args);
        System.out.println("中介出租房子成功！");
        return invoke;
    }
}
