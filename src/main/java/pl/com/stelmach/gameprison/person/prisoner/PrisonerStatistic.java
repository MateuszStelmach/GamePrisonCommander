package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Getter;
import lombok.Setter;
import pl.com.stelmach.gameprison.person.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class PrisonerStatistic {
    private Map<CharacterQuality, Integer> prisonerStat;

    public PrisonerStatistic(ElementBalance elementBalance, HeavenCelestialBalance heavenCelestial, HouseBalance houseBalance,
                             ZodiacSignBalance zodiacSignBalance) {
        prisonerStat = new HashMap<>();
        for (CharacterQuality characterQuality : CharacterQuality.values()) {
            prisonerStat.put(characterQuality, characterQuality.qualityStrentgh(elementBalance, heavenCelestial, houseBalance, zodiacSignBalance));
        }
    }

}

