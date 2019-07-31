package pl.com.stelmach.gameprison.person;

import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public class CharacterQualityBalance {
    private Map<CharacterQuality, Integer> characterQualityBalance;

    public CharacterQualityBalance(Personality personality) {
        characterQualityBalance = new LinkedHashMap<>();
        for (CharacterQuality characterQuality : CharacterQuality.values()) {
            int qualityStrength = characterQuality.qualityStrength(personality);

            characterQualityBalance.put(characterQuality, qualityStrength);
        }

    }
}
