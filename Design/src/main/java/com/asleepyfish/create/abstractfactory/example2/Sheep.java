package com.asleepyfish.create.abstractfactory.example2;

/**
 * @Author: asleepyfish
 * @Date: 2022/11/17 10:28
 * @Description: TODO
 */
public class Sheep implements Animal {
    @Override
    public void breed() {
        System.out.println("养殖羊");
    }
}
