package com.gao.builder;

public class SSAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine buildEngine() {
        System.out.println("发动机");
        // 可以用单例模式或者工厂模式
        return new Engine("源樱发动机");
    }

    @Override
    public OrtalModule builderOrtalNoudle() {
        return new OrtalModule("源樱轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("逃逸塔");
        return new EscapeTower("源樱逃逸塔");
    }
}
