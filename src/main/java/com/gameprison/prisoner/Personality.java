package com.gameprison.prisoner;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Personality {
    private @Getter
    ElementBalance elementBalance;
    private @Getter
    HouseBalance houseBalance;
    private @Getter
    PlanetBalance planetBalance;

    // you can use @AllArgsConstructor
    public Personality(ElementBalance elementBalance, HouseBalance houseBalance, PlanetBalance planetBalance) {
        this.elementBalance = elementBalance;
        this.houseBalance = houseBalance;
        this.planetBalance = planetBalance;
    }



}
