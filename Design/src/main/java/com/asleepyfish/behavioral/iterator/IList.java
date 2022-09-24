package com.asleepyfish.behavioral.iterator;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/7 13:43
 * @Description: TODO
 */
public interface IList<E> {
    Iter<E> iterator();

    void add(E e);

    void remove(E e);

    int size();

    E get(int index);
}
