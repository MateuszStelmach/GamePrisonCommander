package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.Range;
import pl.com.stelmach.gameprison.prisoner.CharacterQuality;

@AllArgsConstructor
@Getter
public enum Houses {
    FIRST(0, 3, CharacterQuality.SELF_CENTERED) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(0);
            int houseEnd = birthChart.getHousePositionInt(1) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    SECOND(1, 2, CharacterQuality.WEALTH_CAPACITY) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(1);
            int houseEnd = birthChart.getHousePositionInt(2) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    THIRD(2, 1, CharacterQuality.COMMUNICATION_SKILLS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(2);
            int houseEnd = birthChart.getHousePositionInt(3) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    FOURTH(3, 3, CharacterQuality.FAMILY_BOUND_STRENGTH) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(3);
            int houseEnd = birthChart.getHousePositionInt(4) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    FIFTH(4, 2, CharacterQuality.CHILDREN_POSSESSION) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(4);
            int houseEnd = birthChart.getHousePositionInt(5) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    SIXTH(5, 1, CharacterQuality.WORK_ABILITY) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(5);
            int houseEnd = birthChart.getHousePositionInt(6) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    SEVENTH(6, 3, CharacterQuality.MARRIAGE_POTENTIAL) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(6);
            int houseEnd = birthChart.getHousePositionInt(7) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    EIGTH(7, 2, CharacterQuality.DRIVE_TO_CRIME) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(7);
            int houseEnd = birthChart.getHousePositionInt(8) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    NINTH(8, 1, CharacterQuality.EDUCTAION_POTENTIAL) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(8);
            int houseEnd = birthChart.getHousePositionInt(9) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    TENTH(9, 3, CharacterQuality.SOCIAL_STATUS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(9);
            int houseEnd = birthChart.getHousePositionInt(10) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    ELEVENTH(10, 2, CharacterQuality.FRIENDS_IN_HIGH_PLACES) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(10);
            int houseEnd = birthChart.getHousePositionInt(11) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    },
    TWELFTH(11, 1, CharacterQuality.ENEMIES_ATTACKS) {
        @Override
        public boolean isInHouse(BirthChart birthChart, int position) {
            int houseStart = birthChart.getHousePositionInt(11);
            int houseEnd = birthChart.getHousePositionInt(0) - 1;
            if (houseStart < houseEnd) {
                return startHouseSmallerThanEndHouse(houseStart, houseEnd, position);
            } else return startHouseBiggerThanEndhouse(houseStart, houseEnd, position);
        }
    };

    private static boolean startHouseBiggerThanEndhouse(int houseStart, int houseEnd, int position) {
        if (Range.between(houseStart, 360).contains(position) ||
                Range.between(0, houseEnd).contains(position)) return true;
        return false;
    }

    private static boolean startHouseSmallerThanEndHouse(int houseStart, int houseEnd, int position) {
        if (Range.between(houseStart, houseEnd).contains(position)) return true;
        else return false;
    }


    private final int positionNumber;
    private final int valueToAdd;
    private final CharacterQuality quality;

    public abstract boolean isInHouse(BirthChart birthChart, int position);


}


