package com.asleepyfish.behavioral.iterator.link;

import com.asleepyfish.behavioral.iterator.Iter;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/15 13:25
 * @Description: TODO
 */
public class LinkIter<E> implements Iter<E> {
    private final LinkList<E> linkList;

    private int index;

    public LinkIter(LinkList<E> linkList) {
        this.linkList = linkList;
    }

    @Override
    public boolean hasNext() {
        return index < linkList.size();
    }

    @Override
    public E next() {
        return linkList.get(index++);
    }
}
