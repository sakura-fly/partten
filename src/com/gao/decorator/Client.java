package com.gao.decorator;

public class Client {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        System.out.println("增加飞--------------");
        FlyCar flyCar = new FlyCar(c);
        WaterCar waterCar = new WaterCar(flyCar);
        flyCar.move();

    }
}
