package com.gameprison.prisoner;


import com.gameprison.astrologyinfluance.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ElementBalance {

    private Map<String, Integer> elementBalance;

    public ElementBalance(BirthChart birthChart) {
        elementBalance = new HashMap<>();
        elementBalance = elementBalanceCalc(birthChart);

    }

    private Map<String, Integer> elementBalanceCalc(BirthChart birthChart) {
        int fireStrength = 0;
        int airStrength = 0;
        int waterStrength = 0;
        int earthStrength = 0;

        for (HeavenCelestial planet : HeavenCelestial.values()) {
            int position = birthChart.getPlanetsPosition().getPlanets().get(planet.getName()).get(0).intValue();
            switch (whatElement(position)) {
                case FIRE:
                    fireStrength += planet.getValueToAdd();
                    break;
                case AIR:
                    airStrength += planet.getValueToAdd();
                    break;
                case WATER:
                    waterStrength += planet.getValueToAdd();
                    break;
                case EARTH:
                    earthStrength += planet.getValueToAdd();
                    break;
            }
        }

        for (Houses houses : Houses.values()) {
            int position = birthChart.getHousesPosition().getCusps().get(houses.getName()).intValue();
            switch (whatElement(position)) {
                case FIRE:
                    fireStrength += houses.getValueToAdd();
                    break;
                case AIR:
                    airStrength += houses.getValueToAdd();
                    break;
                case WATER:
                    waterStrength += houses.getValueToAdd();
                    break;
                case EARTH:
                    earthStrength += houses.getValueToAdd();
                    break;
            }
        }
        elementBalance.put(FourElements.FIRE.name(), fireStrength);
        elementBalance.put(FourElements.AIR.name(), airStrength);
        elementBalance.put(FourElements.WATER.name(), waterStrength);
        elementBalance.put(FourElements.EARTH.name(), earthStrength);
        return elementBalance;
    }

    private FourElements whatElement(int position) {
        if (ZodiacSign.ARIES.getDegree().contains(position) || ZodiacSign.lEO.getDegree().contains(position)
                || ZodiacSign.SIGGITARIUS.getDegree().contains(position)) return FourElements.FIRE;
        if (ZodiacSign.GEMINI.getDegree().contains(position) || ZodiacSign.LIBRA.getDegree().contains(position)
                || ZodiacSign.AQUARIUS.getDegree().contains(position)) return FourElements.AIR;
        if (ZodiacSign.CANCER.getDegree().contains(position) || ZodiacSign.SCORPIO.getDegree().contains(position)
                || ZodiacSign.PICES.getDegree().contains(position)) return FourElements.WATER;
        if (ZodiacSign.TAURUS.getDegree().contains(position) || ZodiacSign.VIRGO.getDegree().contains(position)
                || ZodiacSign.CAPRICORN.getDegree().contains(position)) return FourElements.EARTH;
        throw new IllegalArgumentException("position need to be 0-359 degree int");
    }
}