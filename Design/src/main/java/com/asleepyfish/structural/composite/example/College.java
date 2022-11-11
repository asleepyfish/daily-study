package com.asleepyfish.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 15:29
 * @Description: TODO
 */
public class College extends Component {
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
