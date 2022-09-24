package com.asleepyfish.structural.adapter.example.classadapter;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/19 9:24
 * @Description: TODO
 */
public class AdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println(dc5.output5V());
    }
}
