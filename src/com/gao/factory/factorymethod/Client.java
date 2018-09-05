package com.gao.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
         Car byd = new BydFactory().createCar();
         Car audu = new AudiFactory().createCar();



         byd.run();
         audu.run();
    }
}
