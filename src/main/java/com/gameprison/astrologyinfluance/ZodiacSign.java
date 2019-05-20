package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.Range;

@AllArgsConstructor
public enum ZodiacSign {
    ARIES(Range.between(0, 29), "boldness") {
        @Override
        public boolean isInSign(int position) {
            return ARIES.getDegree().contains(position);
        }
    },
    TAURUS(Range.between(30, 59), "consistent") {
        @Override
        public boolean isInSign(int position) {
            return TAURUS.getDegree().contains(position);
        }
    },
    GEMINI(Range.between(60, 89), "communication") {
        @Override
        public boolean isInSign(int position) {
            return GEMINI.getDegree().contains(position);
        }
    },
    CANCER(Range.between(90, 119), "family bound") {
        @Override
        public boolean isInSign(int position) {
            return CANCER.getDegree().contains(position);
        }
    },
    lEO(Range.between(120, 149), "leadership") {
        @Override
        public boolean isInSign(int position) {
            return lEO.getDegree().contains(position);
        }
    },
    VIRGO(Range.between(150, 179), "cleanness") {
        @Override
        public boolean isInSign(int position) {
            return VIRGO.getDegree().contains(position);
        }
    },
    LIBRA(Range.between(180, 209), "law") {
        @Override
        public boolean isInSign(int position) {
            return LIBRA.getDegree().contains(position);
        }
    },
    SCORPIO(Range.between(210, 239), "drive to crime") {
        @Override
        public boolean isInSign(int position) {
            return SCORPIO.getDegree().contains(position);
        }
    },
    SIGGITARIUS(Range.between(240, 269), "") {
        @Override
        public boolean isInSign(int position) {
            return SIGGITARIUS.getDegree().contains(position);
        }
    },
    CAPRICORN(Range.between(270, 299), "subordination") {
        @Override
        public boolean isInSign(int position) {
            return CAPRICORN.getDegree().contains(position);
        }
    },
    AQUARIUS(Range.between(300, 329), "independent") {
        @Override
        public boolean isInSign(int position) {
            return AQUARIUS.getDegree().contains(position);
        }
    },
    PICES(Range.between(330, 359), "complaines") {
        @Override
        public boolean isInSign(int position) {
            return PICES.getDegree().contains(position);
        }
    };


    @Getter
    private final Range<Integer> degree;
    private final String quality;

    public abstract boolean isInSign(int position);

}
