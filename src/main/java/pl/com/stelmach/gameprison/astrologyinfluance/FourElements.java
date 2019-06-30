package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.prisoner.CharacterQuality;

import java.util.Arrays;


@AllArgsConstructor
@Getter
public enum FourElements {
    FIRE("fire", CharacterQuality.WILL_POWER) {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(FIRE));

        }
    },
    AIR("air", CharacterQuality.INTELLECTUAL_CAPACITY) {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(AIR));

        }
    },
    WATER("water", CharacterQuality.EMOTIONAL_RESPOSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(WATER));

        }
    },
    EARTH("earth", CharacterQuality.MATERIAL_POSSESSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return Arrays.stream(ZodiacSign.values())
                    .filter(zodiacSign -> zodiacSign.isInSign(position))
                    .anyMatch(zodiacSign -> zodiacSign.getSignElement().equals(EARTH));

        }
    };


    private final String name;
    private final CharacterQuality quality;

    public abstract boolean containsElement(int position);

    public static FourElements whatElement(int position) {
        for (FourElements element : values()) {
            if (element.containsElement(position)) return element;
        }
        throw new IllegalArgumentException("element not found for position, position needs to be 0-359 int");
    }
}
