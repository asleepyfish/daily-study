package com.asleepyfish.create.builder.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 17:00
 * @description:
 */
public class ComputerManager {
    public Worker worker;

    public ComputerManager(Worker worker) {
        this.worker = worker;
    }

    public Computer get() {
        worker.installCPU();
        worker.installGPU();
        worker.installMemory();
        return worker.getComputer();
    }
}
