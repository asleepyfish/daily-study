package com.asleepyfish.create.singleton.example;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/10 9:30
 * @Description: TODO
 */
public class RegisterSingleton {
    private static Map<String, Object> registerMap;

    static {
        registerMap = new ConcurrentHashMap<>();
        registerMap.put(RegisterSingleton.class.getName(), new RegisterSingleton());
    }

    private RegisterSingleton() {

    }

    public static Object getInstance(String name) {
        if (name == null) {
            name = RegisterSingleton.class.getName();
        }
        if (!registerMap.containsKey(name)) {
            try {
                registerMap.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return registerMap.get(name);
    }

}
