package com.asleepyfish;

import com.asleepyfish.create.abstractfactory.example.PC;
import com.asleepyfish.create.builder.Builder;
import com.asleepyfish.create.builder.ConcreteBuilder;
import com.asleepyfish.create.builder.Director;
import com.asleepyfish.create.builder.Product;
import com.asleepyfish.create.factorymethod.example2.AppleFactory;
import com.asleepyfish.create.factorymethod.example2.Factory;
import com.asleepyfish.create.prototype.Realizetype;
import com.asleepyfish.create.simplefactory.example.Phone;
import com.asleepyfish.create.simplefactory.example.PhoneFactory;
import com.asleepyfish.create.singleton.example.HungrySingleton;
import com.asleepyfish.create.singleton.example.LazySingleton;
import com.asleepyfish.create.singleton.example.LazySingleton2;
import com.asleepyfish.create.singleton.example.LazySingletonHolder;
import org.junit.jupiter.api.Test;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/28 16:06
 * @Description: 创建型模式
 */
public class CreateTest {
    @Test
    public void simpleFactoryTest() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iPhone = phoneFactory.createPhone("IPhone");
        iPhone.make();
    }

    @Test
    public void factoryMethodTest() {
        Factory factory = new AppleFactory();
        com.asleepyfish.create.factorymethod.example2.Phone phone = factory.createPhone();
        phone.make();
    }

    @Test
    public void abstractFactoryMethod() {
        com.asleepyfish.create.abstractfactory.example.AppleFactory appleFactory = new com.asleepyfish.create.abstractfactory.example.AppleFactory();
        PC pc = appleFactory.createPc();
        pc.make();
        com.asleepyfish.create.abstractfactory.example.Phone phone = appleFactory.createPhone();
        phone.make();
    }

    @Test
    public void builder() {
        Director director = new Director(new ConcreteBuilder());
        Product construct = director.construct();
        System.out.println(construct);
    }

    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype("小明", 20);
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype.equals(clone));
    }

    @Test
    public void singletonTest() {
        System.out.println(HungrySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton2.getInstance());
        System.out.println(LazySingletonHolder.getInstance());
    }
}
