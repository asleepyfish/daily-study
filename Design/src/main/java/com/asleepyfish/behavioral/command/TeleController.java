package com.asleepyfish.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhoujh42045
 * @Date: 2022/12/13 9:30
 * @Description: 遥控器
 */
public class TeleController {
    /**
     * 播放记录
     */
    List<Command> historyCommand = new ArrayList<>();

    /**
     * 切换卫视
     *
     * @param command
     */
    public void switchCommand(Command command) {
        historyCommand.add(command);
        command.execute();
    }

    /**
     * 遥控器返回命令
     */
    public void back() {
        if (historyCommand.isEmpty()) {
            return;
        }
        int size = historyCommand.size();
        int preIndex = Math.max(size - 2, 0);
        // 获取上一个播放某卫视的命令
        Command preCommand = historyCommand.remove(preIndex);
        preCommand.execute();
    }

}


