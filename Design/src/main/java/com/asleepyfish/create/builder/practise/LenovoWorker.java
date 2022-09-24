package com.asleepyfish.create.builder.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 16:52
 * @description:
 */
public class LenovoWorker extends Worker {
    @Override
    void installCPU() {
        computer.setCpu("AMD");
    }

    @Override
    void installMemory() {
        computer.setMemory("8G");
    }

    @Override
    void installGPU() {
        computer.setGpu("RTX3080");
    }
}
