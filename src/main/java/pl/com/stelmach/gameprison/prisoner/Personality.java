package pl.com.stelmach.gameprison.prisoner;

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
