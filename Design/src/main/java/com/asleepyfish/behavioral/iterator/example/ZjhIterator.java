package com.asleepyfish.behavioral.iterator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:05
 * @Description: TODO
 */
public class ZjhIterator<T> implements Iterator<T> {
    private final ZjhList<T> list;

    private int index;

    public ZjhIterator(ZjhList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index != list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
