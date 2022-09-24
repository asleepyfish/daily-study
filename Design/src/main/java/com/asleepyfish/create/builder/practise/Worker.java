package com.asleepyfish.create.builder.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 16:48
 * @description:
 */
public abstract class Worker {
    protected Computer computer = new Computer();

    abstract void installCPU();

    abstract void installMemory();

    abstract void installGPU();

    public Computer getComputer() {
        return computer;
    }
}
