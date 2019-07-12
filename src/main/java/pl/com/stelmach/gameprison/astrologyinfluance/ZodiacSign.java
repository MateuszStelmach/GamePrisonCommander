package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.Range;
import pl.com.stelmach.gameprison.person.CharacterQuality;

@AllArgsConstructor
@Getter
public enum ZodiacSign {
    ARIES(Range.between(0, 29), CharacterQuality.SELF_CENTERED, FourElements.FIRE) {
        @Override
        public boolean isInSign(int position) {
            return ARIES.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(ARIES, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(ARIES, signStrength, birthChart);
            return signStrength;
        }
    },

    TAURUS(Range.between(30, 59), CharacterQuality.WEALTH_CAPACITY, FourElements.EARTH) {
        @Override
        public boolean isInSign(int position) {
            return TAURUS.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(TAURUS, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(TAURUS, signStrength, birthChart);
            return signStrength;
        }
    },

    GEMINI(Range.between(60, 89), CharacterQuality.COMMUNICATION_SKILLS, FourElements.AIR) {
        @Override
        public boolean isInSign(int position) {
            return GEMINI.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(GEMINI, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(GEMINI, signStrength, birthChart);
            return signStrength;
        }
    },

    CANCER(Range.between(90, 119), CharacterQuality.FAMILY_BOUND_STRENGTH, FourElements.WATER) {
        @Override
        public boolean isInSign(int position) {
            return CANCER.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(CANCER, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(CANCER, signStrength, birthChart);
            return signStrength;
        }
    },

    lEO(Range.between(120, 149), CharacterQuality.LEADERSHIP, FourElements.FIRE) {
        @Override
        public boolean isInSign(int position) {
            return lEO.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(lEO, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(lEO, signStrength, birthChart);
            return signStrength;
        }
    },

    VIRGO(Range.between(150, 179), CharacterQuality.WORK_ABILITY, FourElements.EARTH) {
        @Override
        public boolean isInSign(int position) {
            return VIRGO.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(VIRGO, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(VIRGO, signStrength, birthChart);
            return signStrength;
        }
    },

    LIBRA(Range.between(180, 209), CharacterQuality.SOCIAL_STATUS, FourElements.AIR) {
        @Override
        public boolean isInSign(int position) {
            return LIBRA.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(LIBRA, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(LIBRA, signStrength, birthChart);
            return signStrength;
        }
    },

    SCORPIO(Range.between(210, 239), CharacterQuality.DRIVE_TO_CRIME, FourElements.WATER) {
        @Override
        public boolean isInSign(int position) {
            return SCORPIO.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(SCORPIO, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(SCORPIO, signStrength, birthChart);
            return signStrength;
        }
    },

    SIGGITARIUS(Range.between(240, 269), CharacterQuality.AGGRESSION, FourElements.FIRE) {
        @Override
        public boolean isInSign(int position) {
            return SIGGITARIUS.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(SIGGITARIUS, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(SIGGITARIUS, signStrength, birthChart);
            return signStrength;
        }
    },

    CAPRICORN(Range.between(270, 299), CharacterQuality.SUBORDINATION, FourElements.EARTH) {
        @Override
        public boolean isInSign(int position) {
            return CAPRICORN.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(CAPRICORN, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(CAPRICORN, signStrength, birthChart);
            return signStrength;
        }
    },

    AQUARIUS(Range.between(300, 329), CharacterQuality.EDUCTAION_POTENTIAL, FourElements.AIR) {
        @Override
        public boolean isInSign(int position) {
            return AQUARIUS.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(AQUARIUS, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(AQUARIUS, signStrength, birthChart);
            return signStrength;
        }
    },

    PISCES(Range.between(330, 359), CharacterQuality.EMOTIONAL_RESPOSIVENESS, FourElements.WATER) {
        @Override
        public boolean isInSign(int position) {
            return PISCES.getDegree().contains(position);
        }

        @Override
        public int zodiacSignStrength(BirthChart birthChart) {
            int signStrength = 0;
            signStrength += ZodiacSign.zodiacSignStrengthbyHeavenCelestial(PISCES, signStrength, birthChart);
            signStrength += ZodiacSign.zodiacSignStrengthbyHouses(PISCES, signStrength, birthChart);
            return signStrength;
        }
    };

    private final Range<Integer> degree;
    private final CharacterQuality quality;
    private FourElements signElement;

    public abstract boolean isInSign(int position);

    public abstract int zodiacSignStrength(BirthChart birthChart);

    private static int zodiacSignStrengthbyHeavenCelestial(ZodiacSign zodiacSign, int signStrength, BirthChart birthChart) {

        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            int position = birthChart.getPlanetPositionInt(heavenCelestial.getName());
            if (zodiacSign.isInSign(position)) {
                signStrength += heavenCelestial.getValueToAdd();
            }

        }
        return signStrength;
    }

    private static int zodiacSignStrengthbyHouses(ZodiacSign zodiacSign, int signStrength, BirthChart birthChart) {
        for (Houses houses : Houses.values()) {
            int position = birthChart.getHousePositionInt(houses.getPositionNumber());
            if (zodiacSign.isInSign(position)) {
                signStrength += houses.getValueToAdd();
            }
        }
        return signStrength;
    }

}
