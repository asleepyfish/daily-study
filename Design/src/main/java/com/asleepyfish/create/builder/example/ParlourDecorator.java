package com.asleepyfish.create.builder.example;

/**
 * @author: zhoujh
 * @date: 2021/12/6 17:13
 * @description:
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}