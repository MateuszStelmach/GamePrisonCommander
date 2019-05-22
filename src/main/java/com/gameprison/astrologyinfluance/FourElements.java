package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;


@AllArgsConstructor
public enum FourElements {
    FIRE("fire", "will") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSingElement().equals(FIRE));

        }
    },
    AIR("air", "intellect") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSingElement().equals(AIR));

        }
    },
    WATER("water", "emotions") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSingElement().equals(WATER));

        }
    },
    EARTH("earth", "material") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSingElement().equals(EARTH));

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
