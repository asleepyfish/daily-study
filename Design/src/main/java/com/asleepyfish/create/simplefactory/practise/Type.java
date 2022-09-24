package com.asleepyfish.create.simplefactory.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 17:32
 * @description: TODO
 */
public enum Type {
    A("A", 1),
    B("B", 2);
    private String name;
    private Integer value;

    Type(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
