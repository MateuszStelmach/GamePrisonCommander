package pl.com.stelmach.gameprison.person;


import pl.com.stelmach.gameprison.astrologyinfluance.*;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;


@Getter
public class HeavenCelestialBalance {
    private Map<HeavenCelestial, Integer> heavenCelestialMap;

    public HeavenCelestialBalance(BirthChart birthChart) {
        heavenCelestialMap = new TreeMap<>();
        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            heavenCelestialMap.put(heavenCelestial, heavenCelestialCalc(heavenCelestial, birthChart));
        }

    }

    private int heavenCelestialCalc(HeavenCelestial heavenCelestial, BirthChart birthChart) {
        int position = birthChart.getPlanetPositionInt(heavenCelestial.getName());
        int heavenCelestialStrength = 0;
        switch (heavenCelestial) {
            case SUN: {
                if (FourElements.whatElement(position).equals(FourElements.FIRE)) heavenCelestialStrength += 1;
                if (ZodiacSign.lEO.isInSign(position)) heavenCelestialStrength += 2;
                if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength += 1;
                if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength -= 2;
                if (Houses.FIRST.isInHouse(birthChart, position)) heavenCelestialStrength += 2;
                if (Houses.TENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                if (Houses.FIFTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;

            }
            case MOON: {
                if (FourElements.whatElement(position).equals(FourElements.WATER)) heavenCelestialStrength += 1;
                if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength += 2;
                if (ZodiacSign.TAURUS.isInSign(position)) heavenCelestialStrength += 1;
                if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength -= 3;
                if (Houses.SEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 2;
                if (Houses.FOURTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;

            }
            case MARS: {
                if (FourElements.whatElement(position).equals(FourElements.FIRE)) heavenCelestialStrength += 1;
                if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength += 2;
                if (ZodiacSign.lEO.isInSign(position)) heavenCelestialStrength += 1;
                if (ZodiacSign.CAPRICORN.isInSign(position)) heavenCelestialStrength += 1;
                if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength -= 2;
                if (Houses.FIRST.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                if (Houses.SIXTH.isInHouse(birthChart, position)) heavenCelestialStrength += 2;
                return heavenCelestialStrength;
            }
            case VENUS: {
                if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.TAURUS.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength += 2;
                if (ZodiacSign.VIRGO.isInSign(position)) heavenCelestialStrength -= 2;
                if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength += 2;
                if (Houses.SECOND.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                if (Houses.SEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;
            }
            case MERCURY: {
                if (FourElements.whatElement(position).equals(FourElements.AIR)) heavenCelestialStrength += 1;
                if (ZodiacSign.GEMINI.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.VIRGO.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 1;
                if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength -= 2;
                if (Houses.THIRD.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                if (Houses.SIXTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;
            }
            case SATURN: {
                if (ZodiacSign.CAPRICORN.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 3;
                if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength += 2;
                if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength -= 2;
                if (Houses.TENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                if (Houses.FOURTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;
            }
            case URANUS: {
                if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 3;
                if (Houses.ELEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;

            }
            case NEPTUNE: {
                if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength += 3;
                if (Houses.TWELFTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;
            }
            case PLUTO: {
                if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength += 3;
                if (Houses.EIGTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
                return heavenCelestialStrength;
            }
            default:
                return heavenCelestialStrength;
        }
    }


}