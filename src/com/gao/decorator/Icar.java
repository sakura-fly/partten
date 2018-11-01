package com.gao.decorator;

/**
 * 抽象组件
 */
public interface Icar {
    void move();
}

/**
 * 具体构建对象
 */
class Car implements Icar {
    @Override
    public void move() {
        System.out.println("地上跑");
    }
}

/**
 * 装饰角色
 */
class SuperCar implements Icar {

    protected Icar icar;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    @Override
    public void move() {
        icar.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly(){
        System.out.println("飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}


class WaterCar extends SuperCar{

    public WaterCar(Icar icar) {
        super(icar);
    }

    public void swim(){
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
