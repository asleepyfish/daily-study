package com.asleepyfish.behavioral.iterator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 14:40
 * @Description: TODO
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<User> zjhList = new ZjhList<>();
        zjhList.add(new User(1, "小郭"));
        zjhList.add(new User(2, "小王"));
        zjhList.add(new User(3, "小明"));
        Iterator<User> iterator = zjhList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
