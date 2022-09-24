package com.asleepyfish.structural.adapter.example.objectadapter;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/19 10:36
 * @Description: TODO
 */
public class AdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        System.out.println(dc5.output5V());
    }
}
