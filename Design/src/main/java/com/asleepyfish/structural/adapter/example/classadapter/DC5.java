package com.asleepyfish.structural.adapter.example.classadapter;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/18 16:13
 * @Description: 目标类Destination,只需要定义方法，由适配器来转化(产生5V电压)
 */
public interface DC5 {
    int output5V();
}
