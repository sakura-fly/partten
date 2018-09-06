package com.gao.builder;

/**
 * 飞船
 */
public class AirShip {
    private OrtalModule ortalModule;// 轨道舱
    private Engine engine;// 发动机
    private EscapeTower escapeTower;// 逃逸塔

    public OrtalModule getOrtalModule() {
        return ortalModule;
    }

    public void setOrtalModule(OrtalModule ortalModule) {
        this.ortalModule = ortalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
