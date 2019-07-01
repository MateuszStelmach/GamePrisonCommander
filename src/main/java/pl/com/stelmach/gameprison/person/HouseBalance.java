package pl.com.stelmach.gameprison.person;



import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

@Getter
public class HouseBalance {

    private Map<Houses, Integer> houseBalance;

    public HouseBalance(BirthChart birthChart) {
        houseBalance = new TreeMap<>();
        houseBalanceCalc(birthChart);
    }

    private void houseBalanceCalc(BirthChart birthChart) {
        for (Houses houses : Houses.values()) {

            int strength = houseBalance.getOrDefault(houses, 0);

            for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
                int planetPosition = birthChart.getPlanetPositionInt(heavenCelestial.getName());
                if (houses.isInHouse(birthChart, planetPosition)) {
                    strength += heavenCelestial.getValueToAdd();
                }
            }
            houseBalance.put(houses, strength);
        }
    }
}


