package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.CharacterQuality;

@AllArgsConstructor
@Getter
public enum HeavenCelestial {
    SUN("Sun", 3, CharacterQuality.EGO_STRENGTH) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(SUN.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.FIRE.getName()))
                heavenCelestialStrength += 1;
            if (ZodiacSign.lEO.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength += 1;
            if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength -= 2;
            if (Houses.FIRST.isInHouse(birthChart, position)) heavenCelestialStrength += 2;
            if (Houses.TENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.FIFTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    MOON("Moon", 3, CharacterQuality.HEALTH_STRENGTH) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(MOON.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.WATER.getName()))
                heavenCelestialStrength += 1;
            if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.TAURUS.isInSign(position)) heavenCelestialStrength += 1;
            if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength -= 3;
            if (Houses.SEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 2;
            if (Houses.FOURTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    MERCURY("Mercury", 2, CharacterQuality.DECEIVING) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(MERCURY.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.AIR.getName()))
                heavenCelestialStrength += 1;
            if (ZodiacSign.GEMINI.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.VIRGO.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 1;
            if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength -= 2;
            if (Houses.THIRD.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.SIXTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    VENUS("Venus", 2, CharacterQuality.SEX_DRIVE_POTENTIAL) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(VENUS.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.AIR.getName()))
                heavenCelestialStrength += 1;

            if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.TAURUS.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength += 2;
            if (ZodiacSign.VIRGO.isInSign(position)) heavenCelestialStrength -= 2;
            if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength += 2;
            if (Houses.SECOND.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.SEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;


            return heavenCelestialStrength;
        }
    },
    MARS("Mars", 2, CharacterQuality.AGGRESSION) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(MARS.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.FIRE.getName()))
                heavenCelestialStrength += 1;
            if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.lEO.isInSign(position)) heavenCelestialStrength += 1;
            if (ZodiacSign.CAPRICORN.isInSign(position)) heavenCelestialStrength += 1;
            if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength -= 2;
            if (Houses.FIRST.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.SIXTH.isInHouse(birthChart, position)) heavenCelestialStrength += 2;

            return heavenCelestialStrength;
        }
    },
    JUPITER("Jupiter", 2, CharacterQuality.WILL_POWER) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(JUPITER.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.FIRE.getName()))
                heavenCelestialStrength += 1;
            if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.SIGGITARIUS.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.CANCER.isInSign(position)) heavenCelestialStrength += 2;
            if (ZodiacSign.GEMINI.isInSign(position)) heavenCelestialStrength -= 2;
            if (Houses.NINTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.ELEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            return heavenCelestialStrength;
        }
    },
    SATURN("Saturn", 2, CharacterQuality.SUBORDINATION) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(SATURN.name);
            int heavenCelestialStrength = 0;
            FourElements fourElements = FourElements.whatElement(position);

            if (fourElements.getName().equals(FourElements.EARTH.getName()))
                heavenCelestialStrength += 1;

            if (ZodiacSign.CAPRICORN.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 3;
            if (ZodiacSign.LIBRA.isInSign(position)) heavenCelestialStrength += 2;
            if (ZodiacSign.ARIES.isInSign(position)) heavenCelestialStrength -= 2;
            if (Houses.TENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;
            if (Houses.FOURTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    URANUS("Uranus", 1, CharacterQuality.MENTAL_CONDITION) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(URANUS.name);
            int heavenCelestialStrength = 0;

            if (ZodiacSign.AQUARIUS.isInSign(position)) heavenCelestialStrength += 3;
            if (Houses.ELEVENTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    NEPTUNE("Neptune", 1, CharacterQuality.ADDICTION_CAPACITY) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(NEPTUNE.name);
            int heavenCelestialStrength = 0;

            if (ZodiacSign.PISCES.isInSign(position)) heavenCelestialStrength += 3;
            if (Houses.TWELFTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    },
    PLUTO("Pluto", 1, CharacterQuality.LEADERSHIP) {
        @Override
        public int heavenCelestialStrength(BirthChart birthChart) {
            int position = birthChart.getPlanetPositionInt(PLUTO.name);
            int heavenCelestialStrength = 0;

            if (ZodiacSign.SCORPIO.isInSign(position)) heavenCelestialStrength += 3;
            if (Houses.EIGTH.isInHouse(birthChart, position)) heavenCelestialStrength += 3;

            return heavenCelestialStrength;
        }
    };


    private final String name;
    private final int valueToAdd;
    private final CharacterQuality quality;

    public abstract int heavenCelestialStrength(BirthChart birthChart);

}
