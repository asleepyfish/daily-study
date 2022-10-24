package com.asleepyfish.structural.proxy.example.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/26 13:38
 * @Description: Cglib动态代理中介
 */
public class CglibRentProxy implements MethodInterceptor {
    private Object object;

    public Object getProxy(Object object) {
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中介带租客看房");
        Object invoke = method.invoke(object, objects);
        System.out.println("中介出租房子成功！");
        return invoke;
    }
}
