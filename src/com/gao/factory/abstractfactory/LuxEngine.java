package com.gao.factory.abstractfactory;

public class LuxEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动得快");
    }
}
