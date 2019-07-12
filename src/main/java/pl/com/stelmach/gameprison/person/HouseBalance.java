package pl.com.stelmach.gameprison.person;


import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;

import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

@Getter
public class HouseBalance {

    private Map<Houses, Integer> houseBalance;

    public HouseBalance(BirthChart birthChart) {
        houseBalance = new TreeMap<>();
        for (Houses houses : Houses.values()) {
            int houseStrength = houses.houseStrength(birthChart);
            houseBalance.put(houses, houseStrength);
        }
    }

}


