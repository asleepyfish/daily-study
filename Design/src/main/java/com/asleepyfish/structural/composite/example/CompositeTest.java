package com.asleepyfish.structural.composite.example;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/23 13:40
 * @Description: TODO
 */
public class CompositeTest {
    public static void main(String[] args) {
        Component philosophy = new Department("哲学系", "");
        Component history = new Department("历史学系", "");
        Component cs = new Department("计算机系", "");
        Component se = new Department("软件系", "");

        Component computer = new College("计算机学院", "");
        computer.add(cs);
        computer.add(se);

        Component literature = new College("文学院", "");
        literature.add(philosophy);
        literature.add(history);

        Component upc = new University("石大", "");
        upc.add(computer);
        upc.add(literature);
        upc.print();
    }
}
