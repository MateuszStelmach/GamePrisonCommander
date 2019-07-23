package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
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
