package com.asleepyfish.create.prototype;

/**
 * @author: zhoujh
 * @date: 2021/12/3 14:32
 * @description:
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype("张三", 19);
        realizetype.display();
        Realizetype cloneRealizetype = realizetype.clone();
        /*realizetype.setName("李四");
        realizetype.display();*/
        cloneRealizetype.display();
        System.out.println(realizetype == cloneRealizetype);
    }
}
