package com.asleepyfish.behavioral.iterator.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/9 15:08
 * @Description: TODO
 */
public class User {
    private Integer id;

    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
