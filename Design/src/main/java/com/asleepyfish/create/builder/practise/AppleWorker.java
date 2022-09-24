package com.asleepyfish.create.builder.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 16:54
 * @description:
 */
public class AppleWorker extends Worker {
    @Override
    void installCPU() {
        computer.setCpu("Intel");
    }

    @Override
    void installMemory() {
        computer.setMemory("16G");
    }

    @Override
    void installGPU() {
        computer.setGpu("RTX4000");
    }
}
