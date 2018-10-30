package com.gao.bridge;

public class Desktop extends Computer{
    public Desktop(Bradn bradn) {
        super(bradn);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }
}
