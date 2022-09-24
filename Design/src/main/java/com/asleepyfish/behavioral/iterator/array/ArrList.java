package com.asleepyfish.behavioral.iterator.array;

import com.asleepyfish.behavioral.iterator.IList;
import com.asleepyfish.behavioral.iterator.Iter;

import java.util.Arrays;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/7 13:57
 * @Description: TODO
 */
public class ArrList<E> implements IList<E> {
    private Object[] data = {};

    private int size;

    @Override
    public Iter<E> iterator() {
        return new ArrIter<>(this);
    }

    @Override
    public void add(E e) {
        data = Arrays.copyOf(data, size + 1);
        data[size++] = e;
    }

    @Override
    public void remove(E e) {
        int index = 0;
        for (Object o : data) {
            if (o == e) {
                if (size - 1 - index >= 0) {
                    System.arraycopy(data, index + 1, data, index, size - 1 - index);
                }
                data = Arrays.copyOf(data, size--);
            }
            index++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) data[index];
    }
}
