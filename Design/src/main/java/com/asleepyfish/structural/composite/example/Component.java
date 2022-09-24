package com.asleepyfish.structural.composite.example;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/23 11:10
 * @Description: 组合模式描述的是部分-整体关系，大学中的部门和学院，生活中的衣服和衣柜
 * 组合模式:强调部分与整体的组合 桥接模式:强调平行类之间的组合
 * 下面的例子是：
 * 展示学校的层次结果，一个学校有多个学院，一个学院有多个系
 * 抽象构件（Component） 它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为，管理工作由树枝构件完成
 * 树枝构件（Composite）是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 * 树叶构件（Leaf）
 */
public abstract class Component {
    private String name;

    private String description;

    public Component(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Department extends Component {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}

class College extends Component {
    List<Component> componentList = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(Component component) {
        componentList.add(component);
    }

    @Override
    protected void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("-----------" + super.getName() + "-----------");
        for (Component component : componentList) {
            component.print();
        }
    }
}

class University extends Component {
    List<Component> componentList = new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(Component component) {
        componentList.add(component);
    }

    @Override
    protected void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("--------------------" + super.getName() + "--------------------");
        for (Component component : componentList) {
            component.print();
        }
    }
}

