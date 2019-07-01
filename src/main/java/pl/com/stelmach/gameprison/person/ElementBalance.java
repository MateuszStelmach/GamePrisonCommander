package pl.com.stelmach.gameprison.person;


import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.FourElements;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ElementBalance {

    private Map<FourElements, Integer> elementBalance;

    public ElementBalance(BirthChart birthChart) {
        elementBalance = new HashMap<>();
        elementBalanceCalc(birthChart);

    }

    private void elementBalanceCalc(BirthChart birthChart) {
        for (HeavenCelestial planet : HeavenCelestial.values()) {
            int position = birthChart.getPlanetPositionInt(planet.getName());
            FourElements whatElement = FourElements.whatElement(position);
            int strength = elementBalance.getOrDefault(whatElement, 0);
            strength += planet.getValueToAdd();
            elementBalance.put(whatElement, strength);
        }

        for (Houses houses : Houses.values()) {
            int position = birthChart.getHousePositionInt(houses.getPositionNumber());
            FourElements whatElement = FourElements.whatElement(position);
            int strength = elementBalance.getOrDefault(whatElement, 0);
            strength += houses.getValueToAdd();
            elementBalance.put(whatElement, strength);
        }
    }
}