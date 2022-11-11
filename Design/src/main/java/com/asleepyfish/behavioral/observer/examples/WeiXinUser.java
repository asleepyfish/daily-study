package com.asleepyfish.behavioral.observer.examples;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:25
 * @Description: TODO
 */
public class WeiXinUser implements Observer {
    private final String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        String platform = WeiXinUser.class.getName();
        platform = platform.substring(platform.lastIndexOf(".") + 1);
        System.out.println("通过" + platform + "给" + this.name + "更新了" + message);
    }
}
