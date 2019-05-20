package com.gameprison.prisoner;


import com.gameprison.astrologyinfluance.*;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ElementBalance {

    private Map<String, Integer> elementBalance;

    public ElementBalance(BirthChart birthChart) {
        elementBalance = new HashMap<>();
        elementBalanceCalc(birthChart);

    }

    private void elementBalanceCalc(BirthChart birthChart) {

        for (HeavenCelestial planet : HeavenCelestial.values()) {
            int position = birthChart.getPlanetPositionInt(planet.getName());
            FourElements whatElement = FourElements.whatElement(position);
            int strength = elementBalance.getOrDefault(whatElement.name(), 0);
            strength += planet.getValueToAdd();
            elementBalance.put(whatElement.name(), strength);

        }

        for (Houses houses : Houses.values()) {
            int position = birthChart.getHousePositionInt(houses.getPositionNumber());
            FourElements whatElement = FourElements.whatElement(position);
            int strength = elementBalance.getOrDefault(whatElement.name(), 0);
            strength += houses.getValueToAdd();
            elementBalance.put(whatElement.name(), strength);
        }

    }


}