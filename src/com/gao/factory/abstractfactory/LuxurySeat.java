package com.gao.factory.abstractfactory;

public class LuxurySeat implements Seat {
    @Override
    public void message() {
        System.out.println("非常舒服");
    }
}
