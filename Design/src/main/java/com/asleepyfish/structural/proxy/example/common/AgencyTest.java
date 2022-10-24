package com.asleepyfish.structural.proxy.example.common;

import com.asleepyfish.structural.proxy.example.LandLord;
import com.asleepyfish.structural.proxy.example.Rent;

/**
 * @Author: asleepyfish
 * @Date: 2022/10/24 11:55
 * @Description: 普通代码模式测试
 */
public class AgencyTest {
    public static void main(String[] args) {
        Rent landLord = new LandLord();
        Agency agency = new Agency(landLord);
        agency.rent("张三");
    }
}
