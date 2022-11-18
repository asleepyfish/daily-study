package com.asleepyfish.create.abstractfactory.example2;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/17 10:28
 * @Description: TODO
 */
public class Cow implements Animal {
    @Override
    public void breed() {
        System.out.println("养殖牛");
    }
}
