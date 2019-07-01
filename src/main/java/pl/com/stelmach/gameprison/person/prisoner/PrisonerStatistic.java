package pl.com.stelmach.gameprison.person.prisoner;

import lombok.Getter;
import lombok.Setter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;
import pl.com.stelmach.gameprison.person.CharacterQuality;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class PrisonerStatistic {
    private Map<CharacterQuality, Integer> prisonerStat;

    public PrisonerStatistic(BirthChart birthChart) {
        prisonerStat = new HashMap<>();
        for (CharacterQuality characterQuality : CharacterQuality.values()) {
            prisonerStat.put(characterQuality, characterQuality.qualityStrentgh(birthChart));
        }
    }

}

