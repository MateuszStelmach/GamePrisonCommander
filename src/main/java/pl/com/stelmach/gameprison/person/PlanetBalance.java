package pl.com.stelmach.gameprison.person;


import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import lombok.Getter;

import java.util.Map;


@Getter
class PlanetBalance {
    private Map<HeavenCelestial, Integer> planetBalance;


}