package com.gao.factory.simplefactory;

public class CarFactory2 {

    public static Car createCar(String type) {
        Car c = null;
        switch (type) {
            case "奥迪":
                c = new Audi();
                break;
            case "比亚迪":
                c =  new Byd();
                break;
            default:
                break;

        }
        return c;
    }
}
