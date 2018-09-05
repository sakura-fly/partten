package com.gao.factory.simplefactory;

public class ClientWithFactory {

    public static void main(String[] args) {
        Car ad = CarFactory.createCar("奥迪");
        Car byd = CarFactory.createCar("比亚迪");


        try {
            assert ad != null;
            ad.run();
            assert byd != null;
            byd.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
