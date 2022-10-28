package com.asleepyfish;

import com.asleepyfish.create.simplefactory.example.Phone;
import com.asleepyfish.create.simplefactory.example.PhoneFactory;
import org.junit.jupiter.api.Test;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/25 16:28
 * @Description: 设计模式
 */
public class DesignTest {
    @Test
    public void simpleFactory() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone miPhone = phoneFactory.createPhone("MiPhone");
        miPhone.make();
    }


}
