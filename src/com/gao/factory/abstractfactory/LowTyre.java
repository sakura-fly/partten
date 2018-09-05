package com.gao.factory.abstractfactory;

public class LowTyre implements Tyre {
    @Override
    public void quality() {
        System.out.println("质量一般");
    }
}
