package com.asleepyfish.behavioral.iterator.example;

import java.util.Arrays;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 14:14
 * @Description: 容器接口
 */
public interface List<T> {
    Iterator<T> iterator();

    void add(T t);

    int size();

    T get(int index);
}

