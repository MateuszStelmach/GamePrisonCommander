package pl.com.stelmach.gameprison.prisoner;


import org.apache.commons.lang3.Range;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import lombok.Getter;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
            int houseNumber = houses.getPositionNumber();
            int strength = houseBalance.getOrDefault(houses, 0);
            int housePositionStart = birthChart.getHousePositionInt(houseNumber);
            int housePostionEnd;
            if (houses.getPositionNumber() == 11) {
                housePostionEnd = birthChart.getHousePositionInt(0);
            } else housePostionEnd = birthChart.getHousePositionInt(houseNumber + 1);


            if (housePostionEnd > housePositionStart) {
                for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
                    int planetPosition = birthChart.getPlanetPositionInt(heavenCelestial.getName());
                    if (Range.between(housePositionStart, housePostionEnd)
                            .contains(planetPosition)) {
                        strength += heavenCelestial.getValueToAdd();
                    }
                }
                houseBalance.put(houses, strength);
            } else {

                for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
                    int planetPosition = birthChart.getPlanetPositionInt(heavenCelestial.getName());
                    if (Range.between(housePositionStart, 360)
                            .contains(planetPosition) || Range.between(0, housePostionEnd).contains(planetPosition)) {
                        strength += heavenCelestial.getValueToAdd();
                    }
                }
                houseBalance.put(houses, strength);

            }
        }
    }
}
