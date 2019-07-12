package pl.com.stelmach.gameprison.astrologyinfluance;

import com.google.common.collect.Range;
import lombok.AllArgsConstructor;
import lombok.Getter;

import pl.com.stelmach.gameprison.person.CharacterQuality;

@AllArgsConstructor
@Getter
public enum Houses {
    FIRST(0, 3, CharacterQuality.SELF_CENTERED) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(0);
            int houseEnd = birthChart.getHousePositionInt(1);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(FIRST, strength, birthChart);
            return strength;
        }
    },
    SECOND(1, 2, CharacterQuality.WEALTH_CAPACITY) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(1);
            int houseEnd = birthChart.getHousePositionInt(2);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(SECOND, strength, birthChart);
            return strength;
        }
    },
    THIRD(2, 1, CharacterQuality.COMMUNICATION_SKILLS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(2);
            int houseEnd = birthChart.getHousePositionInt(3);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(THIRD, strength, birthChart);
            return strength;
        }
    },
    FOURTH(3, 3, CharacterQuality.FAMILY_BOUND_STRENGTH) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(3);
            int houseEnd = birthChart.getHousePositionInt(4);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(FOURTH, strength, birthChart);
            return strength;
        }
    },
    FIFTH(4, 2, CharacterQuality.CHILDREN_POSSESSION) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(4);
            int houseEnd = birthChart.getHousePositionInt(5);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(FIFTH, strength, birthChart);
            return strength;
        }
    },
    SIXTH(5, 1, CharacterQuality.WORK_ABILITY) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(5);
            int houseEnd = birthChart.getHousePositionInt(6);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(SIXTH, strength, birthChart);
            return strength;
        }
    },
    SEVENTH(6, 3, CharacterQuality.MARRIAGE_POTENTIAL) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(6);
            int houseEnd = birthChart.getHousePositionInt(7);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(SEVENTH, strength, birthChart);
            return strength;
        }
    },
    EIGTH(7, 2, CharacterQuality.DRIVE_TO_CRIME) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(7);
            int houseEnd = birthChart.getHousePositionInt(8);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(EIGTH, strength, birthChart);
            return strength;
        }
    },
    NINTH(8, 1, CharacterQuality.EDUCTAION_POTENTIAL) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(8);
            int houseEnd = birthChart.getHousePositionInt(9);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(NINTH, strength, birthChart);
            return strength;
        }
    },
    TENTH(9, 3, CharacterQuality.SOCIAL_STATUS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(9);
            int houseEnd = birthChart.getHousePositionInt(10);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(TENTH, strength, birthChart);
            return strength;
        }
    },
    ELEVENTH(10, 2, CharacterQuality.FRIENDS_IN_HIGH_PLACES) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(10);
            int houseEnd = birthChart.getHousePositionInt(11);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(ELEVENTH, strength, birthChart);
            return strength;
        }
    },
    TWELFTH(11, 1, CharacterQuality.ENEMIES_ATTACKS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(11);
            int houseEnd = birthChart.getHousePositionInt(0);
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }

        @Override
        public int houseStrength(BirthChart birthChart) {
            int strength = 0;
            strength = houseStrengthbyHeavenCelestial(TWELFTH, strength, birthChart);
            return strength;
        }
    };

    private static boolean startHouseBiggerThanEndhouse(int houseStart, int houseEnd, int position) {
        return (Range.closedOpen(houseStart, 360).contains(position) ||
                Range.closedOpen(0, houseEnd).contains(position));
    }

    private static boolean startHouseSmallerThanEndHouse(int houseStart, int houseEnd, int position) {
        return (Range.closedOpen(houseStart, houseEnd).contains(position));
    }


    private final int positionNumber;
    private final int valueToAdd;
    private final CharacterQuality quality;

    public abstract boolean isInHouse(BirthChart birthChart, int position);

    public abstract int houseStrength(BirthChart birthChart);

    private static int houseStrengthbyHeavenCelestial(Houses houses, int strength, BirthChart birthChart) {
        for (HeavenCelestial heavenCelestial : HeavenCelestial.values()) {
            int planetPosition = birthChart.getPlanetPositionInt(heavenCelestial.getName());
            if (houses.isInHouse(birthChart, planetPosition)) {
                strength += heavenCelestial.getValueToAdd();
            }
        }
        return strength;
    }

}


