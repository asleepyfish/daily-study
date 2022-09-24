package com.asleepyfish.behavioral.observer.examples;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/12 14:31
 * @Description: 观察者接口（订阅者）
 */
public interface Observer {
    void update(String message);
}

class WeiXinUser implements Observer {
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

class WeiBoUser implements Observer {
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
