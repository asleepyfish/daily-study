package com.asleepyfish.create.builder.practise;

/**
 * @author: zhoujh
 * @date: 2021/12/7 17:02
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Worker lenovoWorker = (Worker) ReadXML.getObject();
        ComputerManager computerManager = new ComputerManager(lenovoWorker);
        Computer computer = computerManager.get();
        computer.show();
    }
}
