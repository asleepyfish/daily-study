package com.asleepyfish.create.prototype;

/**
 * @author: zhoujh
 * @date: 2021/12/3 14:29
 * @description:
 */
public class Realizetype implements Cloneable {
    private String name;

    private Integer age;

    public Realizetype(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("具体原型创建成功！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void display() {
        System.out.println("我叫" + name + "，今年" + age + "岁");
    }

    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
