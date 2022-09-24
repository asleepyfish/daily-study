package com.asleepyfish.behavioral.iterator.link;

import com.asleepyfish.behavioral.iterator.IList;
import com.asleepyfish.behavioral.iterator.Iter;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/15 13:25
 * @Description: TODO
 */
public class LinkList<E> implements IList<E> {
    private int size;

    private Node<E> first;

    private Node<E> last;

    @Override
    public Iter<E> iterator() {
        return new LinkIter<>(this);
    }

    @Override
    public void add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(E e) {
        Node<E> f = first;
        if (first == null) {
            throw new NullPointerException();
        }
        if (f.item == e) {
            first = first.next;
            size--;
        }
        while (f.next != null) {
            Node<E> temp = f.next;
            if (temp.item == e) {
                f.next = temp.next;
                size--;
            }
            f = f.next;
            if (f == null) {
                return;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.item;
    }

    static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
