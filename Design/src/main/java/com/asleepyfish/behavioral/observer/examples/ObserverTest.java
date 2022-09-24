package com.asleepyfish.behavioral.observer.examples;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/12 15:36
 * @Description: TODO
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer xiaoming = new WeiXinUser("小明");
        Observer xiaohong = new WeiXinUser("小红");
        Observer xiaohua = new WeiBoUser("小华");
        Subject carSubject = new CarSubject();
        carSubject.attach(xiaoming);
        carSubject.attach(xiaohong);
        carSubject.attach(xiaohua);
        carSubject.notify("订阅信息");
    }
}
