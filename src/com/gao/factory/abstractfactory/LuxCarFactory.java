package com.gao.factory.abstractfactory;

public class LuxCarFactory implements CarFactory {
    @Override
    public Engine createRngine() {
        return new LuxEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxTyre();
    }
}
