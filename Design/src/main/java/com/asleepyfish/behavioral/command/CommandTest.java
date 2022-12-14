package com.asleepyfish.behavioral.command;

/**
 * @Author: zhoujh42045
 * @Date: 2022/12/13 9:30
 * @Description: TODO
 */
public class CommandTest {
    public static void main(String[] args) {
        //创建一个电视机
        Television tv = new Television();
        //创建一个遥控器
        TeleController teleController = new TeleController();

        teleController.switchCommand(new CCTV1Command(tv));
        teleController.switchCommand(new CCTV2Command(tv));
        teleController.switchCommand(new CCTV4Command(tv));
        teleController.switchCommand(new CCTV3Command(tv));
        teleController.switchCommand(new CCTV5Command(tv));
        teleController.switchCommand(new CCTV1Command(tv));
        teleController.switchCommand(new CCTV6Command(tv));
        System.out.println("------返回上一个卫视--------");
        //模拟遥控器返回键
        teleController.back();
        teleController.back();

    }
}
