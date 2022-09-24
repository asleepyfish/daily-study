package com.asleepyfish.behavioral.iterator;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/7 13:46
 * @Description: TODO
 */
public interface Iter<E> {
    boolean hasNext();

    E next();
}
