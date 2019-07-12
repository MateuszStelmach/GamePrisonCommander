package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.CharacterQuality;


@AllArgsConstructor
@Getter
public enum FourElements {
    FIRE("fire", CharacterQuality.WILL_POWER) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.ARIES.isInSign(position) || ZodiacSign.lEO.isInSign(position) || ZodiacSign.SIGGITARIUS.isInSign(position);
        }

        @Override
        public int elementStrength(BirthChart birthChart) {
            int strengthbyPlanet = 0;
            int strenghbyHouses = 0;
            strengthbyPlanet = elementStrengthbyPlanet(FIRE, birthChart, strengthbyPlanet);
            strenghbyHouses = FourElements.elementStrengthbyHouses(FIRE, birthChart, strenghbyHouses);
            return strenghbyHouses + strengthbyPlanet;
        }
    },
    AIR("air", CharacterQuality.INTELLECTUAL_CAPACITY) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.LIBRA.isInSign(position) || ZodiacSign.GEMINI.isInSign(position) || ZodiacSign.AQUARIUS.isInSign(position);

        }

        @Override
        public int elementStrength(BirthChart birthChart) {
            int strengthbyPlanet = 0;
            int strenghbyHouses = 0;
            strengthbyPlanet = elementStrengthbyPlanet(AIR, birthChart, strengthbyPlanet);
            strenghbyHouses = FourElements.elementStrengthbyHouses(AIR, birthChart, strenghbyHouses);
            return strenghbyHouses + strengthbyPlanet;
        }
    },
    WATER("water", CharacterQuality.EMOTIONAL_RESPOSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.CANCER.isInSign(position) || ZodiacSign.PISCES.isInSign(position) || ZodiacSign.SCORPIO.isInSign(position);
        }

        @Override
        public int elementStrength(BirthChart birthChart) {
            int strengthbyPlanet = 0;
            int strenghbyHouses = 0;
            strengthbyPlanet = elementStrengthbyPlanet(WATER, birthChart, strengthbyPlanet);
            strenghbyHouses = FourElements.elementStrengthbyHouses(WATER, birthChart, strenghbyHouses);
            return strenghbyHouses + strengthbyPlanet;
        }
    },
    EARTH("earth", CharacterQuality.MATERIAL_POSSESSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.CAPRICORN.isInSign(position) || ZodiacSign.VIRGO.isInSign(position) || ZodiacSign.TAURUS.isInSign(position);
        }

        @Override
        public int elementStrength(BirthChart birthChart) {
            int strengthbyPlanet = 0;
            int strenghbyHouses = 0;
            strengthbyPlanet = elementStrengthbyPlanet(EARTH, birthChart, strengthbyPlanet);
            strenghbyHouses = FourElements.elementStrengthbyHouses(EARTH, birthChart, strenghbyHouses);
            return strenghbyHouses + strengthbyPlanet;
        }
    };


    private final String name;
    private final CharacterQuality quality;

    public abstract boolean containsElement(int position);

    public abstract int elementStrength(BirthChart birthChart);

    public static FourElements whatElement(int position) {
        if (FourElements.FIRE.containsElement(position)) return FourElements.FIRE;
        if (FourElements.AIR.containsElement(position)) return FourElements.AIR;
        if (FourElements.WATER.containsElement(position)) return FourElements.WATER;
        if (FourElements.EARTH.containsElement(position)) return FourElements.EARTH;
        throw new IllegalArgumentException("element not found for position, position needs to be 0-359 int");
    }

    private static int elementStrengthbyPlanet(FourElements element, BirthChart birthChart, int strength) {
        for (HeavenCelestial planet : HeavenCelestial.values()) {
            int position = birthChart.getPlanetPositionInt(planet.getName());
            if (element.containsElement(position)) strength += planet.getValueToAdd();
        }
        return strength;
    }

    private static int elementStrengthbyHouses(FourElements element, BirthChart birthChart, int strength) {
        for (Houses houses : Houses.values()) {
            int position = birthChart.getHousePositionInt(houses.getPositionNumber());
            if (element.containsElement(position)) strength += houses.getValueToAdd();
        }
        return strength;
    }

}
