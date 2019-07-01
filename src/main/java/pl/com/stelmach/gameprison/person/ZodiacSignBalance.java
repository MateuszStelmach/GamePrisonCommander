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
        zodiacSingBalanceCalc(birthChart);
    }

    private void zodiacSingBalanceCalc(BirthChart birthChart) {
        for (ZodiacSign zodiacSign : ZodiacSign.values()) {
            int signStrength = zodiacSignBalance.getOrDefault(zodiacSign, 0);

            for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
                int position = birthChart.getPlanetPositionInt(heavenCelestial.getName());
                if (zodiacSign.isInSign(position)) {
                    signStrength += heavenCelestial.getValueToAdd();
                }
                zodiacSignBalance.put(zodiacSign, signStrength);
            }

            for (Houses houses : Houses.values()) {
                int position = birthChart.getHousePositionInt(houses.getPositionNumber());
                if (zodiacSign.isInSign(position)) {
                    signStrength += houses.getValueToAdd();
                }
                zodiacSignBalance.put(zodiacSign, signStrength);
            }
        }
    }
}
