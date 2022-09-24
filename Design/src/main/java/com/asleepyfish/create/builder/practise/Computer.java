package com.asleepyfish.create.builder.practise;

import javax.swing.*;
import java.awt.*;

/**
 * @author: zhoujh
 * @date: 2021/12/7 16:42
 * @description:
 */
public class Computer {
    private String cpu;

    private String memory;

    private String gpu;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = cpu;
        JLabel l = new JLabel(new ImageIcon("src/com/learn/create/builder/resources/" + parlour + ".jpg"));
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
