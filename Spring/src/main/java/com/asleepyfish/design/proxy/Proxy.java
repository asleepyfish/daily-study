package com.asleepyfish.design.proxy;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/13 14:52
 * @Description: TODO
 */
public class Proxy implements Rent {
    private Rent rent;

    public Proxy(Rent rent) {
        this.rent = rent;
    }


    @Override
    public void rent() {
        seeHouse();
        rent.rent();
        fare();
    }

    /**
     * 看房
     */
    public void seeHouse() {
        System.out.println("带房客看房");
    }

    /**
     * 收中介费
     */
    public void fare() {
        System.out.println("收中介费");
    }
}
