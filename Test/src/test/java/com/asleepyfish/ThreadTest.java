package com.asleepyfish;

import java.util.concurrent.Semaphore;

/**
 * @Author: zhoujh42045
 * @Date: 2022/11/28 10:10
 * @Description: 线程测试
 */
public class ThreadTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("1111");
                    Thread.sleep(3000);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
