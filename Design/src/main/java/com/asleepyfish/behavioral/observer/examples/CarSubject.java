package com.asleepyfish.behavioral.observer.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车博主（被订阅者（发布者），在微信和微博都有用户（订阅者））
 */
public class CarSubject implements Subject {
    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
