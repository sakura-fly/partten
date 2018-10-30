package com.gao.bridge;

public class Computer {
    protected Bradn bradn;

    public Computer(Bradn bradn) {
        this.bradn = bradn;
    }

    public void sale(){
        bradn.sale();
    }

}
