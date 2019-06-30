package pl.com.stelmach.gameprison.astrologyinfluance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.prisoner.CharacterQuality;

@AllArgsConstructor
@Getter
public enum Houses {
    FIRST(0, 3, CharacterQuality.SELF_CENTERED), //positionNumber  of house is house number h -1, becouse it is the way AstrologyApi lists
    SECOND(1, 2, CharacterQuality.WEALTH_CAPACITY),// houses in function getCupsPosition
    THIRD(2, 1, CharacterQuality.COMMUNICATION_SKILLS),
    FOURTH(3, 3, CharacterQuality.FAMILY_BOUND_STRENGTH),
    FIFTH(4, 2, CharacterQuality.CHILDREN_POSSESSION),
    SIXTH(5, 1, CharacterQuality.WORK_ABILITY),
    SEVENTH(6, 3, CharacterQuality.MARRIAGE_POTENTIAL),
    EIGTH(7, 2, CharacterQuality.DRIVE_TO_CRIME),
    NINTH(8, 1, CharacterQuality.EDUCTAION_POTENTIAL),
    TENTH(9, 3, CharacterQuality.SOCIAL_STATUS),
    ELEVENTH(10, 2, CharacterQuality.FRIENDS_IN_HIGH_PLACES),
    TWELFTH(11, 1, CharacterQuality.ENEMIES_ATTACKS);


    private final int positionNumber;
    private final int valueToAdd;
    private final CharacterQuality quality;

}
