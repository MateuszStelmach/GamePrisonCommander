package pl.com.stelmach.gameprison.astrologyinfluance;


import pl.com.stelmach.gameprison.astrologyinfluance.*;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;


@Getter
public class HeavenCelestialBalance {
    private Map<HeavenCelestial, Integer> heavenCelestialMap;

    public HeavenCelestialBalance(BirthChart birthChart) {
        heavenCelestialMap = new TreeMap<>();
        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            heavenCelestialMap.put(heavenCelestial, heavenCelestial.heavenCelestialStrength(birthChart));
        }

    }
}


