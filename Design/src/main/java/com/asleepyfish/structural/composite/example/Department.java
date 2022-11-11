package com.asleepyfish.structural.composite.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 15:29
 * @Description: TODO
 */
public class Department extends Component {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}
