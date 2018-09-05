package com.gao.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
         CarFactory factory = new LuxCarFactory();
         Engine e = factory.createRngine();
         Seat s = factory.createSeat();
         Tyre t = factory.createTyre();

         e.run();
         s.message();
         t.quality();
    }
}
