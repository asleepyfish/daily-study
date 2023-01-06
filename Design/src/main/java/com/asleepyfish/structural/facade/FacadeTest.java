package com.asleepyfish.structural.facade;

/**
 * @Author: zhoujh42045
 * @Date: 2022/12/12 16:51
 * @Description: TODO
 */
public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
