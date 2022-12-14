package com.asleepyfish.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: asleepyfish
 * @Date: 2022/6/14 9:41
 * @Description: TODO
 */
public class ThreadPoolExe {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 10
                , TimeUnit.SECONDS, new LinkedBlockingQueue<>(), r -> {
            Thread thread = new Thread(r);
            thread.setName("test线程");
            return thread;
        }, new ThreadPoolExecutor.AbortPolicy());
    }
}
