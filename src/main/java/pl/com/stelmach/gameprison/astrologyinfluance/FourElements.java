package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;


@AllArgsConstructor
@Getter
public enum FourElements {
    FIRE("fire", "will") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(FIRE));

        }
    },
    AIR("air", "intellect") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(AIR));

        }
    },
    WATER("water", "emotions") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(WATER));

        }
    },
    EARTH("earth", "material") {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(EARTH));

        }
    };


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
