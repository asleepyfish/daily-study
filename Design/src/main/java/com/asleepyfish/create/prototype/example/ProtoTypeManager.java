package com.asleepyfish.create.prototype.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:12
 * @description:
 */
public class ProtoTypeManager {
    public Map<String, Shape> map = new HashMap<>();

    public ProtoTypeManager() {
        map.put("Circle", new Circle());
        map.put("Square", new Square());
    }

    public void addShape(String key, Shape value) {
        map.put(key, value);
    }

    public Shape getShape(String key) {
        return (Shape) map.get(key).clone();
    }
}
