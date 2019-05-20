package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FourElements {
    FIRE("fire", "will") {
        @Override
        public boolean containsElement(int position) {
            return (ZodiacSign.ARIES.getDegree().contains(position) || ZodiacSign.lEO.getDegree().contains(position)
                    || ZodiacSign.SIGGITARIUS.getDegree().contains(position));
        }
    },
    AIR("air", "intellect") {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.GEMINI.getDegree().contains(position) || ZodiacSign.LIBRA.getDegree().contains(position)
                    || ZodiacSign.AQUARIUS.getDegree().contains(position);
        }
    },
    WATER("water", "emotions") {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.CANCER.getDegree().contains(position) || ZodiacSign.SCORPIO.getDegree().contains(position)
                    || ZodiacSign.PICES.getDegree().contains(position);
        }
    },
    EARTH("earth", "material") {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.TAURUS.getDegree().contains(position) || ZodiacSign.VIRGO.getDegree().contains(position)
                    || ZodiacSign.CAPRICORN.getDegree().contains(position);
        }
    };

    @Getter
    private final String name;
    private final String quality;

    public abstract boolean containsElement(int position);

    public static FourElements whatElement(int position) {
        for (FourElements element : values()) {
            if (element.containsElement(position)) return element;
        }
        throw new IllegalArgumentException("element not found for position, position needs to be 0-359 int");
    }
}
