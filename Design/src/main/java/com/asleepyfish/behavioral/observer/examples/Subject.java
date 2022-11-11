package com.asleepyfish.behavioral.observer.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/12 14:41
 * @Description: 被观察者（发布者）
 * 被观察者和观察者之间是多对多的关系
 * 被观察者是微信订阅号
 * 实现被观察者接口的可以有很多的不同种类订阅号
 * 观察者也可以有很多，甚至很多平台
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}

