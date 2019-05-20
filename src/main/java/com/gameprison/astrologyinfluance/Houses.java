package com.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Houses {
    FIRST(0, 3, "ego"), //positionNumber  of house is house number h -1, becouse it is the way AstrologyApi list
    SECOND(1, 2, "wealth"),// houses in function getCupsPosition
    THIRD(2, 1, "communication"),
    FOURTH(3, 3, "family bound"),
    FIFTH(4, 2, "children"),
    SIXTH(5, 1, "ability to work"),
    SEVENTH(6, 3, "marriage"),
    EIGTH(7, 2, "drive to crime"),
    NINTH(8, 1, "education"),
    TENTH(9, 3, "status"),
    ELEVENTH(10, 2, "friends"),
    TWELFTH(11, 1, "enemies");


    private final int positionNumber;
    private final int valueToAdd;
    private final String quality;

}
