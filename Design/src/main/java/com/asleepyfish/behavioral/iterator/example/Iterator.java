package com.asleepyfish.behavioral.iterator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 14:14
 * @Description: 迭代器接口
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}

