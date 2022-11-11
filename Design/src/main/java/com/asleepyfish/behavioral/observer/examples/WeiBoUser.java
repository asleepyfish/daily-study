package com.asleepyfish.behavioral.observer.examples;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:25
 * @Description: TODO
 */
public class WeiBoUser implements Observer {
    private final String name;

    public WeiBoUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        String platform = WeiBoUser.class.getName();
        platform = platform.substring(platform.lastIndexOf(".") + 1);
        System.out.println("通过" + platform + "给" + name + "更新了" + message);
    }
}
