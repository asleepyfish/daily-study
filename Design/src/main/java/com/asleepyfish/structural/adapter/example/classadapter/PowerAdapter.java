package com.asleepyfish.structural.adapter.example.classadapter;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/18 16:14
 * @Description: 适配器类
 * UML角色
 * Source：需要被适配的类、接口、对象，即Datas。
 * Destination：需要得到的类，Source通过适配得到的类对象，也就是我们期待得到的接口。
 * Adapter：适配器类，协调Source和Destination，使两者能够协同工作。
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        return output220V() / 44;
    }
}
