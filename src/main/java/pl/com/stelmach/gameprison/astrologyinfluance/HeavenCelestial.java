package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.person.CharacterQuality;

@AllArgsConstructor
@Getter
public enum HeavenCelestial {
    SUN("Sun", 3, CharacterQuality.EGO_STRENGTH),
    MOON("Moon", 3, CharacterQuality.HEALTH_STRENGTH),
    MERCURY("Mercury", 2, CharacterQuality.DECEIVING),
    VENUS("Venus", 2, CharacterQuality.SEX_DRIVE_POTENTIAL),
    MARS("Mars", 2, CharacterQuality.SEX_DRIVE_POTENTIAL),
    SATURN("Saturn", 2, CharacterQuality.SUBORDINATION),
    URANUS("Uranus", 1, CharacterQuality.MENTAL_CONDITION),
    NEPTUNE("Neptune", 1, CharacterQuality.ADDICTION_CAPACITY),
    PLUTO("Pluto", 1, CharacterQuality.LEADERSHIP);


    private final String name;
    private final int valueToAdd;
    private final CharacterQuality quality;

}
