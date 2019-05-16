package com.gameprison.astrologyinfluance;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class PlanetList {
    // use immutable list -> this one can be changed be some other code (for example it is possible to add element to list
    public static final List<String> planetList =
            Arrays.asList("Sun", "Moon", "Mercury", "Venus", "Mars", "Pluto", "Neptune", "Uranus");


    // If this list is restricted, create enum
    @RequiredArgsConstructor
    public enum HavenCelestial {
        SUN("Sun", 3),
        MOON("Moon", 3);

        @Getter
        private final String name;
        private final int valueToAdd;

        public int addValue(int value) {
            return value + valueToAdd;
        }

    }
}
