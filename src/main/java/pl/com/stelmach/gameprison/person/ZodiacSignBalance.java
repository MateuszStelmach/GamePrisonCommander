package pl.com.stelmach.gameprison.person;

import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import pl.com.stelmach.gameprison.astrologyinfluance.ZodiacSign;

import java.util.Map;
import java.util.TreeMap;

@Getter
public class ZodiacSignBalance {
    private Map<ZodiacSign, Integer> zodiacSignBalance;

    public ZodiacSignBalance(BirthChart birthChart) {
        zodiacSignBalance = new TreeMap<>();
        for (ZodiacSign zodiacSign : ZodiacSign.values()) {
            int zodiacSignStrength = zodiacSign.zodiacSignStrength(birthChart);
            zodiacSignBalance.put(zodiacSign, zodiacSignStrength);
        }

    }

}
