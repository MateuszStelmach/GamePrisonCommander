package pl.com.stelmach.gameprison.person;

import pl.com.stelmach.gameprison.astrologyinfluance.FourElements;
import pl.com.stelmach.gameprison.astrologyinfluance.HeavenCelestial;
import pl.com.stelmach.gameprison.astrologyinfluance.Houses;
import pl.com.stelmach.gameprison.astrologyinfluance.ZodiacSign;

public enum CharacterQuality {
    WILL_POWER {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.FIRE) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FIRST) < 2
                    & personality.houseStrength(Houses.SEVENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.ARIES) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.ARIES) < 1
                    & personality.zodiacSigStrength(ZodiacSign.PISCES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    INTELLECTUAL_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.AIR) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.AIR) < 5
                    & personality.elementStrength(FourElements.EARTH) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.THIRD) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.THIRD) < 2
                    & personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.GEMINI) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.GEMINI) < 1
                    & personality.zodiacSigStrength(ZodiacSign.PISCES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    EMOTIONAL_SENSITIVITY {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FIFTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FIFTH) < 2
                    & personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CAPRICORN) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    MATERIAL_POSSESSIVENESS {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FOURTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FOURTH) < 2
                    & personality.houseStrength(Houses.ELEVENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.PISCES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    EGO_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.FIRE) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.TENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.TENTH) < 2
                    & personality.houseStrength(Houses.NINTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.lEO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.lEO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CANCER) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    HEALTH_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.FIRE) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.SIXTH) < 2
                    & personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) < 1
                    & personality.zodiacSigStrength(ZodiacSign.ARIES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    DECEIVING {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.AIR) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.AIR) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.NINTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.NINTH) < 2
                    & personality.houseStrength(Houses.ELEVENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.PISCES) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.PISCES) < 1
                    & personality.zodiacSigStrength(ZodiacSign.VIRGO) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    SEX_DRIVE_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.FIRE) < 5
                    & personality.elementStrength(FourElements.EARTH) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.EIGTH) < 2
                    & personality.houseStrength(Houses.ELEVENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.AQUARIUS) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    AGGRESSION {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.FIRE) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.URANUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.URANUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.SECOND) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.SECOND) < 2
                    & personality.houseStrength(Houses.FIFTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.ARIES) < 1
                    & personality.zodiacSigStrength(ZodiacSign.LIBRA) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    SUBORDINATION {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.FIRE) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.URANUS) > 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.TWELFTH) < 2
                    & personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CAPRICORN) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CAPRICORN) < 1
                    & personality.zodiacSigStrength(ZodiacSign.ARIES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    MENTAL_CONDITION {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.AIR) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.AIR) < 5
                    & personality.elementStrength(FourElements.FIRE) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.URANUS) > 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.TENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.TENTH) < 2
                    & personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.GEMINI) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    ADDICTION_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.EARTH) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.NEPTUNE) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.NEPTUNE) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FIFTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FIFTH) < 2
                    & personality.houseStrength(Houses.FOURTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.TAURUS) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    LEADERSHIP {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.ELEVENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.ELEVENTH) < 2
                    & personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.VIRGO) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    SELF_CENTERED {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FIRST) < 2
                    & personality.houseStrength(Houses.SEVENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.lEO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.lEO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.PISCES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    WEALTH_CAPACITY {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.SECOND) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.SECOND) < 2
                    & personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CAPRICORN) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    COMMUNICATION_SKILLS {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.AIR) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.AIR) < 5
                    & personality.elementStrength(FourElements.EARTH) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MERCURY) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.URANUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.THIRD) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.THIRD) < 2
                    & personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.GEMINI) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.GEMINI) < 1
                    & personality.zodiacSigStrength(ZodiacSign.ARIES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    FAMILY_BOUND_STRENGTH {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FOURTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FOURTH) < 2
                    & personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) < 1
                    & personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    CHILDREN_POSSESSION {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FIFTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FIFTH) < 2
                    & personality.houseStrength(Houses.TENTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) < 1
                    & personality.zodiacSigStrength(ZodiacSign.SCORPIO) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    WORK_ABILITY {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.SIXTH) < 2
                    & personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.VIRGO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.VIRGO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.PISCES) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    MARRIAGE_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.FOURTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.FOURTH) < 2
                    & personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.TAURUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.GEMINI) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    DRIVE_TO_CRIME {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.FIRE) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.FIRE) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.EIGTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.EIGTH) < 2
                    & personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CANCER) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    SOCIAL_STATUS {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.WATER) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SATURN) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.SUN) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.TENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.TENTH) < 2
                    & personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.LIBRA) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.LIBRA) < 1
                    & personality.zodiacSigStrength(ZodiacSign.VIRGO) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    EDUCATION_POTENTIAL {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.AIR) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MOON) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.VENUS) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.SEVENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.SEVENTH) < 2
                    & personality.houseStrength(Houses.FIRST) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.CANCER) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CAPRICORN) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    FRIENDS_IN_HIGH_PLACES {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.WATER) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.WATER) < 5
                    & personality.elementStrength(FourElements.FIRE) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.PLUTO) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.ELEVENTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.ELEVENTH) < 2
                    & personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SIGGITARIUS) < 1
                    & personality.zodiacSigStrength(ZodiacSign.VIRGO) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    },
    ENEMIES_ATTACKS {
        @Override
        public int qualityStrength(Personality personality) {
            int qualityStrength = 0;

            if (personality.elementStrength(FourElements.EARTH) > 10)
                qualityStrength++;

            if (personality.elementStrength(FourElements.EARTH) < 5
                    & personality.elementStrength(FourElements.FIRE) > 15)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) > 3)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.MARS) < 0)
                qualityStrength--;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) > 1)
                qualityStrength++;

            if (personality.heavenCelStrength(HeavenCelestial.JUPITER) < 0)
                qualityStrength--;

            if (personality.houseStrength(Houses.TWELFTH) > 9)
                qualityStrength++;


            if (personality.houseStrength(Houses.TWELFTH) < 2
                    & personality.houseStrength(Houses.SIXTH) > 9)
                qualityStrength--;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) > 3)
                qualityStrength++;

            if (personality.zodiacSigStrength(ZodiacSign.SCORPIO) < 1
                    & personality.zodiacSigStrength(ZodiacSign.CANCER) > 9)
                qualityStrength--;


            return qualityStrength;
        }
    };

    public abstract int qualityStrength(Personality personality);


}
