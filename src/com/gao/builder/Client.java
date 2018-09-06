package com.gao.builder;

public class Client {
    public static void main(String[] args) {
         AirShipDirector airShipDirector = new SSAirShipDirector(new SSAirShipBuilder());
        AirShip airShip = airShipDirector.DirectorAirShip();
    }
}
