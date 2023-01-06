package com.asleepyfish.behavioral.command;

/**
 * @Author: zhoujh42045
 * @Date: 2022/12/13 9:27
 * @Description: TODO
 */

/**
 * 播放cctv1的命令
 */
public class CCTV1Command extends Command {
    public CCTV1Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv1();
    }
}

class CCTV2Command extends Command {
    public CCTV2Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv2();
    }
}

class CCTV3Command extends Command {
    public CCTV3Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv3();
    }
}

class CCTV4Command extends Command {
    public CCTV4Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv4();
    }
}

class CCTV5Command extends Command {
    public CCTV5Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv5();
    }
}

class CCTV6Command extends Command {
    public CCTV6Command(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv6();
    }
}



