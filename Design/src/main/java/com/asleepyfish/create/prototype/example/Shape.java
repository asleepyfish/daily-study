package com.asleepyfish.create.prototype.example;

/**
 * @author: zhoujh
 * @date: 2021/12/3 15:02
 * @description:
 */
public interface Shape extends Cloneable{
    public Object clone();

    public void countArea();
}
