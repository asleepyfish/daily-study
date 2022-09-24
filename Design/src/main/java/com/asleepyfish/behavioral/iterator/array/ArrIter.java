package com.asleepyfish.behavioral.iterator.array;

import com.asleepyfish.behavioral.iterator.Iter;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/7 13:58
 * @Description: TODO
 */
public class ArrIter<E> implements Iter<E> {
    private final ArrList<E> arrList;

    private int index;

    public ArrIter(ArrList<E> arrList) {
        this.arrList = arrList;
    }

    @Override
    public boolean hasNext() {
        return index < arrList.size();
    }

    @Override
    public E next() {
        return arrList.get(index++);
    }
}
