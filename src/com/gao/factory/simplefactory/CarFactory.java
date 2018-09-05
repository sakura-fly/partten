package com.gao.factory.simplefactory;

public class CarFactory {
    public Car createCar(String type) {
        switch (type) {
            case "奥迪":
                return new Audi();
            case "比亚迪":
                return  new Byd();
            default:
                return null;
        }
    }
}
