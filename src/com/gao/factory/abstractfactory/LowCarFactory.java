package com.gao.factory.abstractfactory;

public class LowCarFactory implements CarFactory {
    @Override
    public Engine createRngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
