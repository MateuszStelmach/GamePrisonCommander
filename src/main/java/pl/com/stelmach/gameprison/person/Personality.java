package pl.com.stelmach.gameprison.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.stelmach.gameprison.astrologyinfluance.*;

@Getter
@AllArgsConstructor
public class Personality {
    private ElementBalance elementBalance;
    private HouseBalance houseBalance;
    private HeavenCelestialBalance heavenCelestialBalance;
    private ZodiacSignBalance zodiacSignBalance;

    public int elementStrength(FourElements element) {
        return elementBalance.getElementBalance().get(element);
    }

    public int heavenCelStrength(HeavenCelestial heavenCel) {
        return heavenCelestialBalance.getHeavenCelestialMap().get(heavenCel);
    }

    public int houseStrength(Houses house) {
        return houseBalance.getHouseBalance().get(house);
    }

    public int zodiacSigStrength(ZodiacSign zodiacSign) {
        return zodiacSignBalance.getZodiacSignBalance().get(zodiacSign);
    }

}
