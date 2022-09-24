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

class ZjhIterator<T> implements Iterator<T> {
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
