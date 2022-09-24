package com.asleepyfish.create.builder.example;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:16
 * @description:
 */
//指挥者：项目经理
class ProjectManager {
    private Decorator builder;

    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
