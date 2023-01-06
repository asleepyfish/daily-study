package com.asleepyfish.behavioral.command;

/**
 * @Author: zhoujh42045
 * @Date: 2022/12/13 9:26
 * @Description: TODO
 */
public abstract class Command {
    /**
     * 命令接收者：电视机
     */
    protected Television television;

    public Command(Television television) {
        this.television = television;
    }

    /**
     * 命令执行
     */
    abstract void execute();
}
