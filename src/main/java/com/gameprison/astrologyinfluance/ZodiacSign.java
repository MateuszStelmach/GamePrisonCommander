package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.Range;

@AllArgsConstructor
public enum ZodiacSign {
    ARIES(Range.between(0, 29), "boldness"),
    TAURUS(Range.between(30, 59), "consistent"),
    GEMINI(Range.between(60, 89), "communication"),
    CANCER(Range.between(90, 119), "family bound"),
    lEO(Range.between(120, 149), "leadership"),
    VIRGO(Range.between(150, 179), "cleanness"),
    LIBRA(Range.between(180, 209), "law"),
    SCORPIO(Range.between(210, 239), "drive to crime"),
    SIGGITARIUS(Range.between(240, 269), ""),
    CAPRICORN(Range.between(270, 299), "subordination"),
    AQUARIUS(Range.between(300, 329), "independent"),
    PICES(Range.between(330, 359), "complaines");


    @Getter
    private final Range<Integer> degree;
    private final String quality;

}
