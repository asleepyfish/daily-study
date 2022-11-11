package com.asleepyfish;

import com.asleepyfish.behavioral.iterator.Iter;
import com.asleepyfish.behavioral.iterator.array.ArrList;
import com.asleepyfish.behavioral.iterator.link.LinkList;
import com.asleepyfish.behavioral.observer.examples.CarSubject;
import com.asleepyfish.behavioral.observer.examples.Observer;
import com.asleepyfish.behavioral.observer.examples.Subject;
import com.asleepyfish.behavioral.observer.examples.WeiXinUser;
import com.asleepyfish.behavioral.strategy.example.AStrategy;
import com.asleepyfish.behavioral.strategy.example.Context;
import org.junit.jupiter.api.Test;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/31 14:03
 * @Description: 行为模式
 */
public class BehavioralTest {
    @Test
    public void iteratorTest() {
        ArrList<String> list = new ArrList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iter<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void iteratorTest2() {
        LinkList<String> list = new LinkList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iter<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void observerTest() {
        Observer wxUser = new WeiXinUser("小明");
        Subject carSubject = new CarSubject();
        carSubject.attach(wxUser);
        carSubject.notify("订阅");
    }

    @Test
    public void strategyTest() {
        Context context = new Context(new AStrategy());
        System.out.println(context.calPrice(10, 10));
    }
}
