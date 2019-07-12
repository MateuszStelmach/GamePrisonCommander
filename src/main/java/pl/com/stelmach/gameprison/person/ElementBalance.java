package pl.com.stelmach.gameprison.person;


import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.FourElements;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ElementBalance {

    private Map<FourElements, Integer> elementBalance;

    public ElementBalance(BirthChart birthChart) {
        elementBalance = new HashMap<>();
        for (FourElements fourElements : FourElements.values()) {
            elementBalance.put(fourElements, fourElements.elementStrength(birthChart));
        }

    }
}