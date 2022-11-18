package com.asleepyfish.create.simplefactory.example2;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/11 14:12
 * @Description: TODO
 */
public class FruitFactory {
    public static Fruit produceFruit(String name) {
        if ("Orange".equalsIgnoreCase(name)) {
            return new Orange();
        } else if ("Banana".equalsIgnoreCase(name)) {
            return new Banana();
        }
        throw new IllegalArgumentException("不存在当前水果");
    }
}
