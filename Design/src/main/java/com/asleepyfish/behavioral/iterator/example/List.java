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

/**
 * 容器实现类
 * @param <T>
 */
class ZjhList<T> implements List<T> {
    private Object[] data = {};

    private int size;

    @Override
    public Iterator<T> iterator() {
        return new ZjhIterator<>(this);
    }

    @Override
    public void add(T t) {
        data = Arrays.copyOf(data, size + 1);
        data[size++] = t;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    /**
     * 迭代器实现类
     */
/*    private class ZjhIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return index != size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T next() {
            return (T) data[index++];
        }
    }*/
}
