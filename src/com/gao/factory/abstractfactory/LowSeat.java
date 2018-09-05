package com.gao.factory.abstractfactory;

public class LowSeat implements Seat {
    @Override
    public void message() {
        System.out.println("不是特别舒服");
    }
}
