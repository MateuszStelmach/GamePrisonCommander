package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.CharacterQuality;

import java.util.Arrays;


@AllArgsConstructor
@Getter
public enum FourElements {
    FIRE("fire", CharacterQuality.WILL_POWER) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.ARIES.isInSign(position) || ZodiacSign.lEO.isInSign(position) || ZodiacSign.SIGGITARIUS.isInSign(position);
        }
    },
    AIR("air", CharacterQuality.INTELLECTUAL_CAPACITY) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.LIBRA.isInSign(position) || ZodiacSign.GEMINI.isInSign(position) || ZodiacSign.AQUARIUS.isInSign(position);

        }
    },
    WATER("water", CharacterQuality.EMOTIONAL_RESPOSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.CANCER.isInSign(position) || ZodiacSign.PISCES.isInSign(position) || ZodiacSign.SCORPIO.isInSign(position);
        }
    },
    EARTH("earth", CharacterQuality.MATERIAL_POSSESSIVENESS) {
        @Override
        public boolean containsElement(int position) {
            return ZodiacSign.CAPRICORN.isInSign(position) || ZodiacSign.VIRGO.isInSign(position) || ZodiacSign.TAURUS.isInSign(position);
        }
    };


    private final String name;
    private final CharacterQuality quality;

    public abstract boolean containsElement(int position);

    public static FourElements whatElement(int position) {
        if (FourElements.FIRE.containsElement(position)) return FourElements.FIRE;
        if (FourElements.AIR.containsElement(position)) return FourElements.AIR;
        if (FourElements.WATER.containsElement(position)) return FourElements.WATER;
        if (FourElements.EARTH.containsElement(position)) return FourElements.EARTH;
        throw new IllegalArgumentException("element not found for position, position needs to be 0-359 int");
    }
}
