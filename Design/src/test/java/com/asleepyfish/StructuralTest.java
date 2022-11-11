package com.asleepyfish;

import com.asleepyfish.structural.adapter.example.objectadapter.AC220;
import com.asleepyfish.structural.adapter.example.objectadapter.PowerAdapter;
import com.asleepyfish.structural.bridge.example.Blue;
import com.asleepyfish.structural.bridge.example.Circle;
import com.asleepyfish.structural.bridge.example.Shape;
import org.junit.jupiter.api.Test;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:45
 * @Description: 结构型
 */
public class StructuralTest {
    @Test
    public void adaptorTest() {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        System.out.println(powerAdapter.output5V());
    }

    @Test
    public void bridgeTest() {
        Shape circle = new Circle(new Blue());
        circle.draw();
    }
}
