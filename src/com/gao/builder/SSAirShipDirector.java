package com.gao.builder;

public class SSAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SSAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip DirectorAirShip() {
        Engine e = builder.buildEngine();
        EscapeTower t = builder.builderEscapeTower();
        OrtalModule o = builder.builderOrtalNoudle();
        AirShip a = new AirShip();
        a.setEngine(e);
        a.setEscapeTower(t);
        a.setOrtalModule(o);
        return a;
    }
}
