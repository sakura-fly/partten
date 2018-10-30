package com.gao.bridge;

public class Laptop extends Computer {
    public Laptop(Bradn bradn) {
        super(bradn);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }
}
