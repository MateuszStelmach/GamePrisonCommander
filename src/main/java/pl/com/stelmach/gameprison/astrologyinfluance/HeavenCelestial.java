package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HeavenCelestial {
    SUN("Sun", 3, "ego"),
    MOON("Moon", 3, "health"),
    MERCURY("Mercury", 2, "intellect"),
    VENUS("Venus", 2, "sex drive"),
    MARS("Mars", 2, "agression"),
    SATURN("Saturn", 2, "subordination"),
    URANUS("Uranus", 1, "mental condition"),
    NEPTUNE("Neptune", 1, "addiction"),
    PLUTO("Pluto", 1, "leadership");


    private final String name;
    private final int valueToAdd;
    private final String quality;



}
